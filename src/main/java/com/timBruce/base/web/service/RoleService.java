package com.timBruce.base.web.service;

import com.timBruce.base.core.generic.GenericService;
import com.timBruce.base.web.model.Role;

import java.util.List;

/**
 * 角色业务接口
 * Created by BruceTim on 2016/11/18.
 */
public interface RoleService extends GenericService<Role, Long> {

    /**
     * 根据用户id查角色
     *
     * @param uid
     * @return
     */
    List<Role> selectRoleByUid (Long uid);
}
