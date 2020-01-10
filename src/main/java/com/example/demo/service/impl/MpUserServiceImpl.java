package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.MpUserMapper;
import com.example.demo.entity.MpUser;
import com.example.demo.service.MpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2019-10-18
 */
@Service
public class MpUserServiceImpl extends ServiceImpl<MpUserMapper, MpUser> implements MpUserService {


    @Autowired
    private ApplicationContext applicationContext;


    @Override
//    @Transactional
    public void updateTran() {
        MpUser build = MpUser.builder().id(1L).age(999).build();
        baseMapper.updateTran(build);
//        MpUserService service = (MpUserService) applicationContext.getBean("mpUserServiceImpl");
//        service.updateTran1();
        updateTran1();
    }

    @Override
    @Transactional
    public void updateTran1() {
        MpUser build = MpUser.builder().id(2L).age(888).build();
        baseMapper.updateTran(build);
        if (true) {
            throw new RuntimeException("抛出异常！！");
        }

    }
}
