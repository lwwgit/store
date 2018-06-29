package com.cloud.store.service;

/**
 * @Author jitdc
 * @Date Create in 15:31 2018/6/29
 * @Description:
 */
public interface RegisterService {
    /**
     * @Author: jitdc
     * @Date: 15:16 2018/6/29
     * @Description:  判断用户名是否存在
     */
    int usernameIsExist(String name);
    /**
     * @Author: jitdc
     * @Date: 15:17 2018/6/29
     * @Description: 判断手机号是否存在
     */
    int telIsExist(String tel);
}
