package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamTestController {

    @Autowired
    private UserService userService;

    @GetMapping("/param/hello")
    public Object hello (){
        userService.testParam("test1", 1, "test2");

        return "success";
    }

}
