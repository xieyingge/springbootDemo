package com.example.demo.service.impl;

import com.example.demo.dao.ShippingCostAreaDao;
import com.example.demo.entity.CountryPostalCode;
import com.example.demo.entity.ShippingCostArea;
import com.example.demo.service.CountryPostalCodeService;
import com.example.demo.service.ShippingCostAreaService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
}
