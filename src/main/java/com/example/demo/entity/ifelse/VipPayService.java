package com.example.demo.entity.ifelse;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static com.example.demo.entity.ifelse.Constants.VipType.VIP;

@Service
public class VipPayService implements UserPayService,InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        //如果该超级会员刚过期，并且没有使用过临时折扣，return八折价格，更新折扣使用次数
        return orderPrice.multiply(BigDecimal.valueOf(0.9));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register(VIP, this);
    }
}
