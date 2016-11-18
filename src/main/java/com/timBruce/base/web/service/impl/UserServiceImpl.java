package com.timBruce.base.web.service.impl;

import com.timBruce.base.core.generic.GenericDao;
import com.timBruce.base.core.generic.GenericServiceImpl;
import com.timBruce.base.web.dao.UserMapper;
import com.timBruce.base.web.model.User;
import com.timBruce.base.web.service.UserService;

import javax.annotation.Resource;

/**
 * Created by BruceTim on 2016/11/18.
 */
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public GenericDao<User, Long> getDao () {
        return userMapper;
    }

    @Override
    public User selectByUsernameCacheCade (String username) {
        return userMapper.selectByUsernameCachecade(username);
    }

    @Override
    public User selectByUsername (String username) {
        User user = new User();
        user.setUsername(username);
        return userMapper.selectBySelective(user);
    }
}
