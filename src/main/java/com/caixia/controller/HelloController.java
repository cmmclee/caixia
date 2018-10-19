package com.caixia.controller;

import com.caixia.config.CaiXiaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-18
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private CaiXiaConfig caiXiaConfig;

    @RequestMapping("/")
    public String sayHello() {
        return "Hello, "+ caiXiaConfig.getName()+ "_" + caiXiaConfig.getBrithday();
    }


}
