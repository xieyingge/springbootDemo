package com.example.demo.service;

import com.example.demo.entity.CountryPostalCode;

import java.util.List;

public interface CountryPostalCodeService {

    List<CountryPostalCode> selectAll();

    List<CountryPostalCode> selectNotCrawlerPostalCode();

}
