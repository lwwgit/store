package com.cloud.store.mapper;

import com.cloud.store.domain.entity.UserStore;
import com.cloud.store.domain.entity.UserStoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserStoreMapper {
    int countByExample(UserStoreExample example);

    int deleteByExample(UserStoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserStore record);

    int insertSelective(UserStore record);

    List<UserStore> selectByExample(UserStoreExample example);

    UserStore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserStore record, @Param("example") UserStoreExample example);

    int updateByExample(@Param("record") UserStore record, @Param("example") UserStoreExample example);

    int updateByPrimaryKeySelective(UserStore record);

    int updateByPrimaryKey(UserStore record);
}