package com.example.demo.entity;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class ShippingCostFeeDetail {

    public static final String FEE_A_NAME = "BaseCharge";
    public static final String FEE_B_NAME = "FuelSurcharge";
    public static final String FEE_C_NAME = "other";

    private BigDecimal totalNetCharge;
    private BigDecimal BaseCharge;
    private BigDecimal FuelSurcharge;
    private BigDecimal other;

}
