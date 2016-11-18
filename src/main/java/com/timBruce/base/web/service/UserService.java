package com.timBruce.base.web.service;

import com.timBruce.base.core.generic.GenericService;
import com.timBruce.base.web.model.User;

/**
 * 用户业务接口
 * Created by BruceTim on 2016/11/18.
 */
public interface UserService extends GenericService<User, Long> {

    /**
     * 根据用户名查用户
     *
     * @param username
     * @return
     */
    User selectByUsername (String username);

    /**
     * 根据用户名查用户（级联查角色权限）
     *
     * @param username
     * @return
     */
    User selectByUsernameCacheCade (String username);

}
