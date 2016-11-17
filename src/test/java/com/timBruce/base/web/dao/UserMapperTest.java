package com.timBruce.base.web.dao;

import com.alibaba.fastjson.JSON;
import com.timBruce.base.core.util.PasswordHelper;
import com.timBruce.base.web.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * Created by BruceTim on 2016/11/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void selectByPrimaryKey () throws Exception {

        long id = 1001L;
        User user = userMapper.selectByPrimaryKey(id);
        System.out.println(JSON.toJSONString(user));
    }

    @Test
    public void selectBySelective () throws Exception {
        User user = new User();
        user.setUsername("admin");
        user = userMapper.selectBySelective(user);
        System.out.println(JSON.toJSONString(user));
        System.out.println("******************");

        User user1 = new User();
        user1.setUsername("admin");
        user1.setSalt(user.getSalt());
        user1.setPassword("123456");
        PasswordHelper.authPassword(user1, PasswordHelper.algorithmName_MD5, 2);
        user1 = userMapper.selectBySelective(user1);
        System.out.println(JSON.toJSONString(user1));
    }

    @Test
    public void deleteByPrimaryKey () throws Exception {
        long id = 1002L;
        System.out.println(userMapper.deleteByPrimaryKey(id));
    }

    @Test
    public void insert () throws Exception {
        User user = new User();
        user.setId(1002L);
        user.setUsername("admin");
        user.setPassword("123456");
        user.setCreateTime(new Date());
        user.setSex("男");
        PasswordHelper.encryptPassword(user, PasswordHelper.algorithmName_MD5, 2);
        System.out.println(userMapper.insert(user));
    }

    @Test
    public void insertSelective () throws Exception {

    }

    @Test
    public void updateByPrimaryKeySelective () throws Exception {
        User user = new User();
        user.setId(1002L);
        user.setPassword("12345678");
        user.setSex("女");
        PasswordHelper.encryptPassword(user, PasswordHelper.algorithmName_MD5, 2);
        System.out.println(userMapper.updateByPrimaryKeySelective(user));
        System.out.println(userMapper.selectByPrimaryKey(1002L));
    }

    @Test
    public void updateByPrimaryKey () throws Exception {

    }

}