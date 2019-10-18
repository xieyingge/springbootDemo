package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.MpUserMapper;
import com.example.demo.entity.MpUser;
import com.example.demo.service.MpUserService;
import org.springframework.stereotype.Service;

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

}
