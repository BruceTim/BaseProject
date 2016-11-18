package com.timBruce.base.web.dao;

import com.timBruce.base.core.generic.GenericDao;
import com.timBruce.base.web.model.User;

public interface UserMapper extends GenericDao<User, Long> {
    int deleteByPrimaryKey (Long id);

    int insert (User record);

    int insertSelective (User record);

    User selectByPrimaryKey (Long id);

    User selectBySelective (User user);

    int updateByPrimaryKeySelective (User record);

    int updateByPrimaryKey (User record);

    User selectByUsernameCachecade (String username);
}