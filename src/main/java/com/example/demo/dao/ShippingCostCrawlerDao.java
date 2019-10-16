package com.example.demo.dao;

import com.example.demo.entity.ShippingCostArea;
import com.example.demo.entity.ShippingCostCrawler;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShippingCostCrawlerDao {

    void insertBatch(@Param("params") List<ShippingCostCrawler> params);

    void insert(@Param("param") ShippingCostCrawler param);

    List<ShippingCostCrawler> selectListByParam(ShippingCostArea param);
}
