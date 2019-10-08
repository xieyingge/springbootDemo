package com.example.demo.service.impl;

import com.example.demo.dao.CountryPostalCodeDao;
import com.example.demo.entity.CountryPostalCode;
import com.example.demo.service.CountryPostalCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CountryPostalCodeServiceImpl implements CountryPostalCodeService {

    @Autowired
    private CountryPostalCodeDao dao;

    @Override
    public List<CountryPostalCode> selectAll() {
        return dao.selectAll();
    }
}
