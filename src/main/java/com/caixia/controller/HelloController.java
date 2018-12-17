package com.caixia.controller;

import com.caixia.config.CaiXiaConfig;
import com.caixia.config.rabbit.HelloSender;
import com.caixia.dao.mongo.UserMongoDao;
import com.caixia.dao.redis.SpringJedisDao;
import com.caixia.entity.mongo.UserMongoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
    @Autowired
    private UserMongoDao userMongoDao;
    @Autowired
    private HelloSender helloSender;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(HttpRequest request) {
        System.out.println(request.toString());
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


    @RequestMapping(value = "/mongo/get", method = RequestMethod.GET)
    public String mongoGet() {
        UserMongoEntity userMongoEntity = userMongoDao.getUserMongoEntity("li");
        return userMongoEntity.toString();
    }

    @RequestMapping(value = "/mq", method = RequestMethod.GET)
    public void helloMq() {
        for (int i=0;i<100;i++) {
            helloSender.send("hello " + i);
        }
    }

}
