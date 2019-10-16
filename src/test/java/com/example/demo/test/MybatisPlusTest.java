package com.example.demo.test;


import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList() {

        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);

        userList.forEach(System.out::println);
    }

}
