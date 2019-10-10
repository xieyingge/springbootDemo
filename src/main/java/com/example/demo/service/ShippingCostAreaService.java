package com.example.demo.service;

import com.example.demo.entity.ShippingCostArea;
import com.example.demo.fedex.rate.stub.Party;

import java.math.BigDecimal;
import java.util.List;

public interface ShippingCostAreaService {

    int insert(ShippingCostArea param);


    void getShippingCostAndInsert(final BigDecimal destination, final BigDecimal increment, BigDecimal startWeight, String serviceType, Party from, Party to);

    void multiProcessGetShippingCostAndInsert();


    void nomalProcessGetShippingCostAndInsert();

    void generateAllAreaFromCA();

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
}
