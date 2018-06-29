package com.cloud.store.service.impl;

import com.cloud.store.domain.entity.UserInfo;
import com.cloud.store.mapper.UserInfoMapper;
import com.cloud.store.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author jitdc
 * @Date Create in 15:20 2018/6/29
 * @Description: 用户信息表
 */
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int insert(UserInfo userInfo){
        int insert = userInfoMapper.insert(userInfo);
        return insert;
    }
}
