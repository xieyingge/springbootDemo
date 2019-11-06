package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.CountryPostalCodeDao;
import com.example.demo.entity.CountryPostalCode;
import com.example.demo.service.CountryPostalCodeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryPostalCodeServiceImpl extends ServiceImpl<CountryPostalCodeDao, CountryPostalCode> implements CountryPostalCodeService {



    @Override
    public List<CountryPostalCode> selectAll() {
        return baseMapper.selectAll();
    }

    @Override
    public List<CountryPostalCode> selectNotCrawlerPostalCode() {
        return baseMapper.selectNotCrawlerPostalCode();
    }
}

