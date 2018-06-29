package com.cloud.store.service;

import com.cloud.store.domain.entity.UserInfo;

/**
 * @Author jitdc
 * @Date Create in 15:33 2018/6/29
 * @Description:
 */
public interface UserInfoService {
    /**
     * @Author: jitdc
     * @Date: 15:22 2018/6/29
     * @Description: 想用户信息表添加一条数据
     */
    int insert(UserInfo userInfo);
}
