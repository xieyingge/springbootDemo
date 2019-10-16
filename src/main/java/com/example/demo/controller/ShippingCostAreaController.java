package com.example.demo.controller;

import com.example.demo.service.ShippingCostAreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.example.demo.entity.Result.toResult;

@Controller
@Slf4j
@RequestMapping("/shippingcostarea")
public class ShippingCostAreaController {

    @Autowired
    private ShippingCostAreaService shippingCostAreaService;


    @RequestMapping("/generateAllAreaFromCA")
    @ResponseBody
    public Object generateAllAreaFromCA(){
        shippingCostAreaService.generateAllAreaFromCA();

        return toResult();
    }


    @RequestMapping("/multiGenerateAllAreaFromCA")
    @ResponseBody
    public Object multiGenerateAllAreaFromCA(){
        shippingCostAreaService.multiGenerateAllAreaFromCA();

        return toResult();
    }

}
