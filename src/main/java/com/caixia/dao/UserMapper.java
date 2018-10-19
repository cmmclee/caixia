package com.caixia.dao;

import com.caixia.entity.User;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-19
 */
public interface UserMapper {

    User findByName(String name);

    int saveUser(User user);
}
