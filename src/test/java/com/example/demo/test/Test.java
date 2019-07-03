package com.example.demo.test;

import com.example.demo.service.impl.SysUserServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class Test {

    @Autowired
    private SysUserServiceImpl sysUserService;

    @org.junit.Test
    public void test() {

        System.out.println(sysUserService.updateUser());
        System.out.println(sysUserService.selectList());
    }

}
