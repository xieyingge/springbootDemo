package com.example.demo.entity;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ShippingCostArea {

    private Long id;
    private Long shippingCompanyId;
    private Long shippingMethodId;

    private String shippingFromCountry;
    private String shippingFromState;
    private String shippingFromCity;
    private String shippingFromZipcode;

    private String shippingToCountry;
    private String shippingToState;
    private String shippingToCity;
    private String shippingToZipcode;

    private Date createDate;
    private Date updateDate;

    private Integer createBy;
    private Integer updateBy;

    private String errorCode;
    private String errorMessage;

}
