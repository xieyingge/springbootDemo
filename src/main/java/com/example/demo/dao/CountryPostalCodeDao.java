package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.CountryPostalCode;

import java.util.List;

public interface CountryPostalCodeDao extends BaseMapper<CountryPostalCode> {


    List<CountryPostalCode> selectAll();

    List<CountryPostalCode> selectNotCrawlerPostalCode();

}
