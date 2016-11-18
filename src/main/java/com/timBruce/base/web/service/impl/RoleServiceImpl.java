package com.timBruce.base.web.service.impl;

import com.timBruce.base.core.generic.GenericDao;
import com.timBruce.base.core.generic.GenericServiceImpl;
import com.timBruce.base.web.dao.RoleMapper;
import com.timBruce.base.web.model.Role;
import com.timBruce.base.web.service.RoleService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by BruceTim on 2016/11/18.
 */
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<Role> selectRoleByUid (Long uid) {
        return null;
    }

    @Override
    public GenericDao<Role, Long> getDao () {
        return roleMapper;
    }
}
