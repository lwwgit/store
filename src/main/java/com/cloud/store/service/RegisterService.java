package com.cloud.store.service;

import com.cloud.store.domain.entity.SysUser;
import com.cloud.store.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author jitdc
 * @Date Create in 14:06 2018/6/29
 * @Description:
 */
@Service
public class RegisterService {
    @Autowired
    private SysUserMapper sysUserMapper;
    public int usernameIsExist(String name){
        SysUser sysUser = sysUserMapper.selectByName(name);
        if (sysUser == null)
            return 0;
        else
            return 1;
    }
}
