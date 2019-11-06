package com.example.demo.entity.ifelse;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static com.example.demo.entity.ifelse.Constants.VipType.PARTICULARLY_VIP;

@Service
public class ParticularlyVipPayService implements UserPayService,InitializingBean {


    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        if (orderPrice.compareTo(BigDecimal.valueOf(30)) > 0) {
            return orderPrice.multiply(BigDecimal.valueOf(0.7));
        }
        return orderPrice;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register(PARTICULARLY_VIP,this);
    }
}
