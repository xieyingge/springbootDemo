package com.example.demo.dao;

import com.example.demo.entity.ShippingCostAcquire;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShippingCostAcquireDao {


    int insert(ShippingCostAcquire param);

    int insertBatch(@Param("params") List<ShippingCostAcquire> params);
}
