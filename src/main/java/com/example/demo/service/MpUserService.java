package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.MpUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2019-10-18
 */
public interface MpUserService extends IService<MpUser> {

    void updateTran();

    void updateTran1();
}
