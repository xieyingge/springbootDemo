package com.example.demo.controller;

import com.example.demo.config.TestProps;
import com.example.demo.entity.MyProps;
import com.example.demo.entity.SysUser;
import com.example.demo.exception.BusinessException;
import com.example.demo.service.impl.SysUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/helloworld")
public class HelloworldController {

    @Autowired
    private SysUserServiceImpl sysUserService;

    @Autowired
    private MyProps myProps;

    @Autowired
    private TestProps testProps;

    @Autowired
    private RedisTemplate redisTemplate;

    //    @ResponseBody
    @RequestMapping("/index")
    public String hello(Model model) {
        try {
            List<SysUser> sysUsers = sysUserService.selectList();
            System.out.println(sysUsers);
            model.addAttribute("users", sysUsers);
            System.out.println(testProps);
            redisTemplate.opsForValue().set("hello", "world");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "test";
    }

    @RequestMapping("/getRedisVal")
    @ResponseBody
    public Object getRedisValue(Model model) {

        return redisTemplate.opsForValue().get("hello");
    }

    @RequestMapping("/testException")
    @ResponseBody
    public String testException(Model model) throws BusinessException {
        try {
            int i = 9;
            int t = i / 0;
        } catch (Exception e) {
            throw new BusinessException("发生了 business异常！！！", e);
        }
        return "ll";
    }

}
