package com.caixia.cache;

import com.caixia.constant.RedisCacheNames;
import com.caixia.dao.UserMapper;
import com.caixia.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserCache {

    private static Logger logger = LoggerFactory.getLogger(UserCache.class);
    @Autowired
    private UserMapper userMapper;

    @Cacheable(cacheNames = RedisCacheNames._USER, key = "#name")
    public User findUserByName(String name) throws Exception{
        User user = new User();
        try {
            user = userMapper.findByName(name);
        } catch (Exception e) {
            logger.error("cache findUserByName is error:", e);
        }
        return user;
    }

}
