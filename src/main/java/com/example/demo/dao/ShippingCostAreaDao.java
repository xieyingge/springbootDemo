package com.example.demo.dao;

import com.example.demo.entity.ShippingCostArea;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShippingCostAreaDao {


    int insert(ShippingCostArea param);

    int insertBatch(@Param("params") List<ShippingCostArea> params);

    /**
     * select area by company  not include in crawler table
     *
     * @param shippingCompany
     * @return
     */
    List<ShippingCostArea> selectByShippingCompany(@Param("shippingCompany") Long shippingCompany);

    void updateErrorCodeAndMesage(ShippingCostArea area);

    List<ShippingCostArea> selectByShippingCompanyAndZipcode(@Param("shippingCompany") Long shippingCompany, @Param("zipcode") String zipcode);


    void updateNoSupportErrorMessage(ShippingCostArea notSupportServiceArea);
}
