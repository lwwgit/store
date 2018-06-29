package com.cloud.store.service.impl;



import com.cloud.store.domain.entity.SysUser;
import com.cloud.store.mapper.SysUserMapper;
import com.cloud.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public int insert(SysUser user){
        int insert = sysUserMapper.insert(user);
        return  insert;
    }
    @Override
    public int updateTel(SysUser user){
        int i = sysUserMapper.updateByPrimaryKey(user);
        return i;
    }
    @Override
    public SysUser selectByName(String name){
        SysUser sysUser = sysUserMapper.selectByName(name);
        return sysUser;
    }
    @Override
    public  SysUser selectByTel(String tel){
        SysUser sysUser = sysUserMapper.selectByTel(tel);
        return sysUser;
    }
    @Override
    public int updateAll(SysUser user){
        int i = sysUserMapper.updateByPrimaryKey(user);
        return i;
    }
}
