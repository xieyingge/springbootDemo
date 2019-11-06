package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@TableName("COUNTRYPOSTALCODE")
public class CountryPostalCode {
    private String zip;
    private String city;
    private String state;
    private String county;
    private String timezone;
    private String country;
    private String acceptableCities;
    private String type;
    private Integer latitude;
    private Integer longitude;

}
