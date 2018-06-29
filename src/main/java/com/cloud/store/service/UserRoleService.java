package com.cloud.store.service;

import com.cloud.store.domain.entity.SysUserRole;

import java.util.List;

/**
 * @Author jitdc
 * @Date Create in 15:53 2018/6/29
 * @Description: 用户角色关系表
 */
public interface UserRoleService {
    /**
     * @Author: jitdc
     * @Date: 16:44 2018/6/29
     * @Description: 根据用户id得到用户有哪些角色
     */
    List<SysUserRole> selectByUserId(Integer id);
}
