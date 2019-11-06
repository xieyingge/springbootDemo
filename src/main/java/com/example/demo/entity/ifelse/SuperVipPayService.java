package com.example.demo.entity.ifelse;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static com.example.demo.entity.ifelse.Constants.VipType.SUPER_VIP;

@Service
public class SuperVipPayService implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {

        return orderPrice.multiply(BigDecimal.valueOf(0.8));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register(SUPER_VIP, this);
    }
}
