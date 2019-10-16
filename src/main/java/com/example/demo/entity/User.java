package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_sys_user")
public class User {
    private Long id;
    @TableField("user_name")
    private String name;
    @TableField(exist = false)
    private Integer age;
    @TableField(exist = false)
    private String email;

}
