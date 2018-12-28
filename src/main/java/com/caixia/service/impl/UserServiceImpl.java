package com.caixia.service.impl;

import com.caixia.dao.UserMapper;
import com.caixia.entity.User;
import com.caixia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Override
    public User getUserByName(final String name) {
        threadPoolTaskExecutor.execute(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(name);
            }
        });
        return userMapper.getUserByName(name);
    }

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }
}
