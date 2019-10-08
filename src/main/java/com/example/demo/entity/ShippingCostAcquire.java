package com.example.demo.entity;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ShippingCostAcquire {
    private Long shippingCostAcquireId;
    private Integer shippingCompany;
    private Integer shippingMethod;

    private String weightFrom;
    private String weightTo;

    private String shippingFee;

    private String shippingFromCountry;
    private String shippingFromState;
    private String shippingFromCity;
    private String shippingFromZipcode;

    private String shippingToCountry;
    private String shippingToState;
    private String shippingToCity;
    private String shippingToZipcode;

    private Date createTime;
    private Date updateTime;

    private String errorCode;
    private String errorMessage;

}
