package com.example.demo.service;

import com.example.demo.entity.ShippingCostAcquire;
import com.fedex.rate.stub.Party;

import java.math.BigDecimal;

public interface ShippingCostAcquireService {

    int insert(ShippingCostAcquire param);


    void getShippingCostAndInsert(final BigDecimal destination, final BigDecimal increment, BigDecimal startWeight, String serviceType, Party from, Party to);

    void multiProcessGetShippingCostAndInsert();


    void nomalProcessGetShippingCostAndInsert();

}
