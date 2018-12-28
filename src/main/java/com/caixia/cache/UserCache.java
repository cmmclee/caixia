package com.caixia.cache;

import com.caixia.constant.RedisCacheNames;
import com.caixia.entity.User;
import com.caixia.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserCache {

    private static Logger logger = LoggerFactory.getLogger(UserCache.class);
    @Autowired
    private UserService userService;

    @Cacheable(cacheNames = RedisCacheNames._USER, key = "#name")
    public User getUserByName(String name) throws Exception{
        User user = new User();
        try {
            user = userService.getUserByName(name);
        } catch (Exception e) {
            logger.error("cache getUserByName is error:", e);
        }
        return user;
    }

}
