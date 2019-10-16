package com.example.demo.service.impl;

import com.example.demo.dao.ShippingCostAreaDao;
import com.example.demo.entity.CountryPostalCode;
import com.example.demo.entity.ShippingCostArea;
import com.example.demo.service.CountryPostalCodeService;
import com.example.demo.service.ShippingCostAreaService;
import com.example.demo.util.ShippingCostUtil;
import com.example.demo.util.ThreadPoolUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

import static com.example.demo.entity.ShippingCompany.FEDEX;
import static com.example.demo.entity.ShippingCompany.getCrawlerNeedFedexCompany;
import static com.example.demo.entity.ShippingCostArea.*;


@Service
@Slf4j
public class ShippingCostAreaServiceImpl implements ShippingCostAreaService {

    @Autowired
    private ShippingCostAreaDao dao;

    @Autowired
    private CountryPostalCodeService countryPostalCodeService;

    private final int PROCESS_NUM = Runtime.getRuntime().availableProcessors();
    private final ThreadFactory GENERATE_AREA_THREAD_FACTORY = ThreadPoolUtil.getNamedThreadFactory("allService-crawler-%d");
    private ExecutorService generateAreaPool = ThreadPoolUtil.getPool(2 * PROCESS_NUM, GENERATE_AREA_THREAD_FACTORY);

    @Override
    public void multiGenerateAllAreaFromCA() {
        log.info("multi process generate area start, select all des!");
        List<CountryPostalCode> allDemosticDestination = countryPostalCodeService.selectAll();
        log.info("des records: {}", allDemosticDestination.size());
        List<List<CountryPostalCode>> splitDatas = ShippingCostUtil.splitData(allDemosticDestination, allDemosticDestination.size() / (PROCESS_NUM * 2 - 1));
        log.info("multi process split data size: {}", splitDatas.size());
        List<Long> fedexCompany = getCrawlerNeedFedexCompany();
        for (List<CountryPostalCode> destinations : splitDatas) {
            generateAreaPool.submit(new Task(destinations, fedexCompany));
        }
        log.info("multi process submit task end !!");
    }

    private class Task implements Runnable {
        private List<CountryPostalCode> destinations;
        private List<Long> fedexCompany;
        public Task(List<CountryPostalCode> destinations, List<Long> fedexCompany) {
            this.destinations = destinations;
            this.fedexCompany = fedexCompany;
        }

        @Override
        public void run() {
            try {
                List<ShippingCostArea> container = new ArrayList<>(120);
                for (CountryPostalCode des : destinations) {
                    for (Long companyId : fedexCompany) {
                        addAceptableCities(container, des, companyId);
                        container.add(getShippingCostArea(des, companyId));
                        if (container.size() >= 100) {
                            dao.insertBatch(container);
                            container.clear();
                        }
                    }
                }
                if (!container.isEmpty()) {
                    dao.insertBatch(container);
                }
                log.error("my job is finished!");
            } catch (Exception ignore) {
                log.error("multi generate area exception!");
            }
        }
    }

    @Override
    public int insert(ShippingCostArea param) {
        return dao.insert(param);
    }


    @Override
    public void generateAllAreaFromCA() {
        List<Long> fedexCompany = getCrawlerNeedFedexCompany();
        generateAreaByFedexCompany(fedexCompany);
    }



    private void generateAreaByFedexCompany(List<Long> fedexCompany) {
        List<CountryPostalCode> allDemosticDestination = countryPostalCodeService.selectAll();
        List<ShippingCostArea> container = new ArrayList<>(120);

        for (CountryPostalCode des : allDemosticDestination) {
            for (Long companyId : fedexCompany) {
                addAceptableCities(container, des, companyId);
                container.add(getShippingCostArea(des, companyId));
                if (container.size() >= 100) {
                    dao.insertBatch(container);
                    container.clear();
                }
            }
        }
        if (!container.isEmpty()) {
            dao.insertBatch(container);
        }
    }

    private void addAceptableCities(List<ShippingCostArea> container, CountryPostalCode des, Long companyId) {
        String acceptableCities = des.getAcceptableCities();
        if (StringUtils.isNotBlank(acceptableCities)) {
            String[] cities = acceptableCities.split(",");
            for (String city : cities) {
                container.add(getShippingCostArea(des, companyId, city));
            }
        }
    }

    private ShippingCostArea getShippingCostArea(CountryPostalCode des, Long companyId, String toCity) {
        return ShippingCostArea.builder()
                .shippingCompanyId(FEDEX)
                .shippingMethodId(companyId)
                .shippingFromCountry(FROM_COUNTRY)
                .shippingFromState(FROM_STATE)
                .shippingFromCity(FROM_CITY)
                .shippingFromZipcode(FROM_POSTAL_CODE)
                .shippingToCountry(des.getCountry())
                .shippingToState(des.getState())
                .shippingToCity(toCity)
                .shippingToZipcode(des.getZip())
                .build();
    }

    private ShippingCostArea getShippingCostArea(CountryPostalCode des, Long companyId) {
        return getShippingCostArea(des, companyId, des.getCity());
    }


    @Override
    public List<ShippingCostArea> selectByShippingCompany(Long fedex) {
        return dao.selectByShippingCompany(fedex);
    }


    @Override
    public void updateErrorCodeAndMesage(ShippingCostArea area) {
        dao.updateErrorCodeAndMesage(area);
    }

    @Override
    public List<ShippingCostArea> selectByShippingCompanyAndZipcode(Long shippingCompany, String zipcode) {
        return dao.selectByShippingCompanyAndZipcode(shippingCompany, zipcode);
    }

    @Override
    public void updateNoSupportErrorMessage(List<ShippingCostArea> notSupportServiceArea) {
        for (ShippingCostArea area : notSupportServiceArea) {
            dao.updateNoSupportErrorMessage(area);
        }
    }


    @Override
    public void updateErrorCodeAndMesageAllServiceType(ShippingCostArea area, List<Long> crawlerNeedFedexCompany) {
        dao.updateErrorCodeAndMesageAllServiceType(area.getErrorCode(), area.getErrorMessage(),
                area.getShippingToZipcode(),area.getShippingToCity(), crawlerNeedFedexCompany);
    }
}
