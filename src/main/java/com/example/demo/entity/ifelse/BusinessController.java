package com.example.demo.entity.ifelse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

@Controller
@RequestMapping("/calPrice")
public class BusinessController {


    @Autowired
    private BusinessServiceImpl businessService;

    @RequestMapping("/getByType")
    @ResponseBody
    public Object getPriceByUserType(String type, BigDecimal orderPrice){
        User user = new User();
        user.setType(type);
        BigDecimal bigDecimal = businessService.calPrice(orderPrice, user);
        return bigDecimal;
    }

}
