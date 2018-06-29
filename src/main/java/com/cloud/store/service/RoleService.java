package com.cloud.store.service;

import com.cloud.store.domain.entity.SysRole;

/**
 * @Author jitdc
 * @Date Create in 15:32 2018/6/29
 * @Description: 角色表
 */
public interface RoleService {
    /**
     * @Author: jitdc
     * @Date: 16:43 2018/6/29
     * @Description: 根据id读取角色类
     */
    SysRole SelectById(Integer id);
}
