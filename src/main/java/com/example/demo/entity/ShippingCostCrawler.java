package com.example.demo.entity;


import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ShippingCostCrawler {
    private Long id;
    private Long shippingCostAreaId;

    private BigDecimal weightFrom;
    private BigDecimal weightTo;

    private BigDecimal shippingFee;

    private String feeAName;
    private BigDecimal feeA;

    private String feeBName;
    private BigDecimal feeB;

    private String feeCName;
    private BigDecimal feeC;

    private Date createDate;
    private Date updateDate;

    private Integer createBy;
    private Integer updateBy;


}
