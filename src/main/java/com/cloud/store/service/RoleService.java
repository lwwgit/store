package com.cloud.store.service;




import com.cloud.store.domain.entity.SysRole;
import com.cloud.store.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    public SysRole SelectById(Integer id){
        return sysRoleMapper.selectByPrimaryKey(id);
    }
}
