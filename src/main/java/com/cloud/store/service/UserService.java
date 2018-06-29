package com.cloud.store.service;

import com.cloud.store.domain.entity.SysUser;

/**
 * @Author jitdc
 * @Date Create in 15:45 2018/6/29
 * @Description:
 */
public interface UserService {
    /**
     * @Author: jitdc
     * @Date: 16:44 2018/6/29
     * @Description: 添加一条用户数据
     */
    int insert(SysUser user);
    /**
     * @Author: jitdc
     * @Date: 16:45 2018/6/29
     * @Description: 修改手机号
     */
    int updateTel(SysUser user);
    /**
     * @Author: jitdc
     * @Date: 16:45 2018/6/29
     * @Description: 根据用户名获取一条用户数据
     */
    SysUser selectByName(String name);
    /**
     * @Author: jitdc
     * @Date: 16:45 2018/6/29
     * @Description: 根据手机号获取一条用户数据
     */
    SysUser selectByTel(String tel);
    /**
     * @Author: jitdc
     * @Date: 16:46 2018/6/29
     * @Description: 修改SysUser的数据
     */
    int updateAll(SysUser user);
}
