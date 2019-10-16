package com.example.demo.service;

import com.example.demo.entity.ShippingCostArea;
import com.example.demo.entity.ShippingCostCrawler;

import java.util.List;

public interface ShippingCostCrawlerService {

    void nomalProcessGetShippingCostAndInsert();

    void insertBatch(List<ShippingCostCrawler> params);

    void insert(ShippingCostCrawler param);

    void multiProcessGetShippingCostAndInsert();

    void normalGetShippingCostAllServiceType();

    void multiProcessGetShippingCostAllServiceType();

    /**
     *  acceptable city in crawler table
     * @param param  to zipcode    co city
     * @return
     */
    List<ShippingCostCrawler> selectListByParam(ShippingCostArea param);

}
