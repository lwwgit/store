package com.cloud.store.service;



import com.cloud.store.domain.entity.SysUserRole;
import com.cloud.store.mapper.SysUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    public List<SysUserRole> selectByUserId(Integer id){
       return sysUserRoleMapper.selectByPrimaryKey(id);
    }
}
