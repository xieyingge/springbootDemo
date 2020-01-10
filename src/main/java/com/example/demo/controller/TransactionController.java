package com.example.demo.controller;

import com.example.demo.service.MpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tran")
public class TransactionController {


    @Autowired
    private MpUserService mpUserService;

    @RequestMapping("/hello")
    public Object hello(){
        mpUserService.updateTran();

        return "999回滚，888不回滚";
    }




}
