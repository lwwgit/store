package com.cloud.store.service.impl;




import com.cloud.store.domain.entity.SysRole;
import com.cloud.store.mapper.SysRoleMapper;
import com.cloud.store.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Override
    public SysRole SelectById(Integer id){
        return sysRoleMapper.selectByPrimaryKey(id);
    }
}
