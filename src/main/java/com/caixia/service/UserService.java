package com.caixia.service;

import com.caixia.entity.User;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-19
 */
public interface UserService {

    User findByName(String name);

    int saveUser(User user);
}
