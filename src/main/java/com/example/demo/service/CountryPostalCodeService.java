package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.CountryPostalCode;

import java.util.List;

public interface CountryPostalCodeService extends IService<CountryPostalCode> {

    List<CountryPostalCode> selectAll();

    List<CountryPostalCode> selectNotCrawlerPostalCode();

}
