package com.timBruce.base.web.dao;

import com.timBruce.base.core.generic.GenericDao;
import com.timBruce.base.web.model.Permission;

public interface PermissionMapper extends GenericDao<Permission, Long> {
    int deleteByPrimaryKey (Long id);

    int insert (Permission record);

    int insertSelective (Permission record);

    Permission selectByPrimaryKey (Long id);

    int updateByPrimaryKeySelective (Permission record);

    int updateByPrimaryKey (Permission record);
}