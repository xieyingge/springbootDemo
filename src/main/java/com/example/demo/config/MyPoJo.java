package com.example.demo.config;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MyPoJo {


    private String description;

    private String name;

    private Integer age;

}
