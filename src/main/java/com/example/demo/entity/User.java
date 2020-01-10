package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@TableName("t_sys_user")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Long id;
    @TableField("user_name")
    private String name;
    @TableField(exist = false)
    private Integer age;
    @TableField(exist = false)
    private String email;

}
