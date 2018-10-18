package com.caixia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-18
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }
}
