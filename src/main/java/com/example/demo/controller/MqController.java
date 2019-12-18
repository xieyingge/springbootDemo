package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.mq.produce.ConfirmMessageProduce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mq")
public class MqController {


    @Autowired
    private ConfirmMessageProduce confirmMessageProduce;

    @RequestMapping("/send")
    @ResponseBody
    public Object send(){
        confirmMessageProduce.sendMessage();
        return Result.toResult();
    }
}
