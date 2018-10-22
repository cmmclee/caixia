package com.caixia.controller;

import com.caixia.config.CaiXiaConfig;
import com.caixia.dao.redis.SpringJedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-18
 */
@RestController
public class HelloController {

    @Autowired
    private CaiXiaConfig caiXiaConfig;
    @Autowired
    private SpringJedisDao springJedisDao;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "hello";
    }


    @RequestMapping(value = "/redis/set", method = RequestMethod.GET)
    public String redis() {
        springJedisDao.set("li","18");
        return "ok";
    }


    @RequestMapping(value = "/redis/get", method = RequestMethod.GET)
    public String redisGet() {
        return springJedisDao.get("li");
    }

}
