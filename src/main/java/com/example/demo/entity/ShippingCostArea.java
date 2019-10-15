package com.example.demo.entity;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ShippingCostArea {

    public static final String FROM_COUNTRY = "US";
    public static final String FROM_STATE = "CA";
    public static final String FROM_CITY = "Daly City";
    public static final String FROM_POSTAL_CODE = "94014";

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
