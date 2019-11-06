package com.example.demo.entity.ifelse;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BusinessServiceImpl {

    public BigDecimal calPrice(BigDecimal orderPrice, User user) {
        String type = user.getType();
        UserPayService byUserType = UserPayServiceStrategyFactory.getByUserType(type);
        return byUserType.quote(orderPrice);
    }

}
