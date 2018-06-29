package com.cloud.store.service.impl;



import com.cloud.store.domain.entity.SysUserRole;
import com.cloud.store.mapper.SysUserRoleMapper;
import com.cloud.store.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    @Override
    public List<SysUserRole> selectByUserId(Integer id){
       return sysUserRoleMapper.selectByPrimaryKey(id);
    }
}
