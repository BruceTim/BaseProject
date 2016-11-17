package com.timBruce.base.web.dao;

import com.timBruce.base.web.model.Role;

public interface RoleMapper {
    int deleteByPrimaryKey (Long id);

    int insert (Role record);

    int insertSelective (Role record);

    Role selectByPrimaryKey (Long id);

    int updateByPrimaryKeySelective (Role record);

    int updateByPrimaryKey (Role record);
}