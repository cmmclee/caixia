package com.caixia.controller;

import com.caixia.entity.User;
import com.caixia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-19
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public String saveUser(User user) {
        userService.saveUser(user);
        return "saved "+ user.getName()+ "_" + user.getAge();
    }

    @RequestMapping("/get")
    public String getUser(String name) {
        User user = userService.findByName(name);
        return "Hello, "+ user.getName()+ "_" + user.getAge();
    }

}
