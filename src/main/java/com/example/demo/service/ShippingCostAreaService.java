package com.example.demo.service;

import com.example.demo.entity.ShippingCostArea;

import java.util.List;

public interface ShippingCostAreaService {

    int insert(ShippingCostArea param);

    void generateAllAreaFromCA();

    void multiGenerateAllAreaFromCA();

    /**
     *  select by type
     * @param fedex
     *      FEDEX = 1L;
     *     USPS = 2L;
     *     DHL = 3L;
     * @return
     */
    List<ShippingCostArea> selectByShippingCompany(Long fedex);

    void updateErrorCodeAndMesage(ShippingCostArea area);

    List<ShippingCostArea> selectByShippingCompanyAndZipcode(Long shippingCompany, String zipcode);


    void updateNoSupportErrorMessage(List<ShippingCostArea> notSupportServiceArea);

    void updateErrorCodeAndMesageAllServiceType(ShippingCostArea area, List<Long> crawlerNeedFedexCompany);

}
