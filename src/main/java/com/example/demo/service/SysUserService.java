package com.example.demo.service;

import com.example.demo.entity.SysUser;

import java.util.List;

public interface SysUserService {

    List<SysUser> selectList();

    int updateUser();

}
