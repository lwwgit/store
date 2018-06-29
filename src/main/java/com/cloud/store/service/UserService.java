package com.cloud.store.service;



import com.cloud.store.domain.entity.SysUser;
import com.cloud.store.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    public int insert(SysUser user){
        int insert = sysUserMapper.insert(user);
        return  insert;
    }
    public int updateTel(SysUser user){
        int i = sysUserMapper.updateByPrimaryKey(user);
        return i;
    }
    public SysUser selectByName(String name){
        SysUser sysUser = sysUserMapper.selectByName(name);
        return sysUser;
    }
    public  SysUser selectByTel(String tel){
        SysUser sysUser = sysUserMapper.selectByTel(tel);
        return sysUser;
    }
    public int updateAll(SysUser user){
        int i = sysUserMapper.updateByPrimaryKey(user);
        return i;
    }
}
