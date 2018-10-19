package com.caixia.controller;

import com.caixia.entity.User;
import com.caixia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-19
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public String saveUser(User user) {
        userService.saveUser(user);
        return "saved "+ user.getName()+ "_" + user.getAge();
    }

    @RequestMapping("/get")
    public String getUser(String name, Model model) {
        User user = userService.findByName(name);
        model.addAttribute("user", user);
        return "user/userList";
    }

}
