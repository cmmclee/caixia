package com.caixia.service.impl;

import com.caixia.dao.UserMapper;
import com.caixia.entity.User;
import com.caixia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-19
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }
}
