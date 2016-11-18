package com.timBruce.base.web.dao;

import com.timBruce.base.core.generic.GenericDao;
import com.timBruce.base.web.model.Role;

import java.util.List;

public interface RoleMapper extends GenericDao<Role, Long> {
    int deleteByPrimaryKey (Long id);

    int insert (Role record);

    int insertSelective (Role record);

    Role selectByPrimaryKey (Long id);

    int updateByPrimaryKeySelective (Role record);

    int updateByPrimaryKey (Role record);

    List<Role> selectByUserid (Long uid);
}