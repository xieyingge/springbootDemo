package com.example.demo.test;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.CountryPostalCode;
import com.example.demo.entity.MpUser;
import com.example.demo.entity.User;
import com.example.demo.service.CountryPostalCodeService;
import com.example.demo.service.MpUserService;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class MybatisPlusTest {


    @Autowired
    private UserMapper userMapper;


    @Autowired
    private UserService userService;

    @Autowired
    private MpUserService mpUserService;

    @Autowired
    private CountryPostalCodeService countryPostalCodeService;

    @Test
    public void testQueryWrapper() {
        QueryWrapper<MpUser> queryWrapper = new QueryWrapper<>();
//        queryWrapper.lambda().eq(MpUser::getId, 1);

//        Map<SFunction<MpUser,?>, Object> param = new HashMap<>();
//        param.put(MpUser::getId, 1);
//        param.put(MpUser::getAge, null);
//        queryWrapper.lambda().allEq(param);

//        queryWrapper.lambda().eq(MpUser::getAge,"18").ne(MpUser::getId,2);

//        queryWrapper.lambda().gt(MpUser::getAge,18).lt(MpUser::getAge,28);

//        queryWrapper.lambda().ge(MpUser::getAge,18).le(MpUser::getAge,28);

//        queryWrapper.lambda().between(MpUser::getAge, 18, 24);//包含18 跟24

//        queryWrapper.lambda().notBetween(false,MpUser::getAge, 18, 24);

//        queryWrapper.lambda().like(MpUser::getName,"ja");

//        queryWrapper.lambda().likeLeft(MpUser::getName,"ja");

//        queryWrapper.lambda().inSql(MpUser::getId,"select id from t_mp_user where age > 24");

//        queryWrapper.lambda().orderBy(true, true, MpUser::getAge).orderBy(true, false, MpUser::getId); // age asc, id desc

//        queryWrapper.lambda().eq(MpUser::getId, 1).or().eq(MpUser::getName, "xieyingge");

//        queryWrapper.lambda().eq(MpUser::getId, 1).or(t -> t.eq(MpUser::getId, 6).or().like(MpUser::getName, "ja"));

//        queryWrapper.lambda().exists("select 1 from t_mp_user a where a.age = t_mp_user.id");

//        queryWrapper.lambda().notExists("select 1 from t_mp_user a where a.age = t_mp_user.id");

        List<MpUser> list = mpUserService.list(new LambdaQueryWrapper<MpUser>().ne(MpUser::getAge,18).ne(MpUser::getId,1));
        System.out.println(list);
    }

    @Test
    public void testInsert() {
        boolean xieyingge = mpUserService.save(MpUser.builder().id(7L).age(6).name("666").email("6666").build());
        System.out.println(xieyingge);
    }


    @Test
    public void testUpdate() {
        UpdateWrapper<MpUser> updateWrapper = new UpdateWrapper<>();
        updateWrapper.lambda().set(MpUser::getEmail, "ppp@195-email.com").eq(MpUser::getName,"Jack").eq(MpUser::getAge,20);
        boolean update = mpUserService.update(MpUser.builder().build(), updateWrapper);
//        boolean b = mpUserService.updateById(MpUser.builder().name("lwx").id(7L).build());
        System.out.println(update);
    }

    @Test
    public void testMpMpUse() {

        Page<MpUser> page = new Page<>(2,2);
        page.setAsc("id");
        IPage<MpUser> page1 = mpUserService.page(page);
        System.out.println(page1.getRecords());
    }

    @Test
    public void testOraclePage() {

        Page<CountryPostalCode> page = new Page<>(1,2);
        page.setAsc("zip");
        countryPostalCodeService.page(page);
    }


    @Test
    public void testSelectList() {
        System.out.println(("----- selectAll method test ------"));
        List<User> list = userService.list(null);
//        User one = userService.getOne(Wrappers.().eq(User::getId, 199));
        System.out.println(list);
    }

}
