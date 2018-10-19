package com.caixia.controller;

import com.caixia.config.CaiXiaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-18
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private CaiXiaConfig caiXiaConfig;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello() {
        return "hello";
    }


}
