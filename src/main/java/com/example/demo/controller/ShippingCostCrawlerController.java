package com.example.demo.controller;


import com.example.demo.service.ShippingCostCrawlerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.example.demo.entity.Result.toResult;

@Controller
@Slf4j
@RequestMapping("/shippingcostcrawler")
public class ShippingCostCrawlerController {

    @Autowired
    private ShippingCostCrawlerService shippingCostCrawlerService;

    @RequestMapping("/normalGetShippingCost")
    @ResponseBody
    public Object normalGetShippingCost() {
        shippingCostCrawlerService.nomalProcessGetShippingCostAndInsert();
        return toResult();
    }

    @RequestMapping("/multiProcessGetShippingCost")
    @ResponseBody
    public Object multiProcessGetShippingCost(){
        try {
            shippingCostCrawlerService.multiProcessGetShippingCostAndInsert();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return toResult();
    }

}
