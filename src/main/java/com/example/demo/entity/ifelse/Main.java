package com.example.demo.entity.ifelse;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        UserPayService strategy = new VipPayService();
        BigDecimal quote = strategy.quote(BigDecimal.valueOf(300));
        System.out.println("普通会员的商品的最终价格为： " +  quote);

        strategy = new SuperVipPayService();
        quote = strategy.quote(BigDecimal.valueOf(300));
        System.out.println("超级会员的商品的最终价格为： " +  quote);
    }
}
