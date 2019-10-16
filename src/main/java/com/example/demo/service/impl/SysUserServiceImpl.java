package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.SysUserDao;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.SysUser;
import com.example.demo.entity.User;
import com.example.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl extends ServiceImpl<UserMapper, User> implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public int updateUser() {
        return sysUserDao.updateUser();
    }

    @Override
    public List<SysUser> selectList() {
        return sysUserDao.selectList();
    }
}
