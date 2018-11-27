package com.caixia.controller;

import com.caixia.cache.UserCache;
import com.caixia.entity.User;
import com.caixia.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-19
 */
@RequestMapping("/user")
@Controller
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private UserCache userCache;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(User user) {
        userService.saveUser(user);
        return "saved "+ user.getName()+ "_" + user.getAge();
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getUser(String name, Model model) {
        User user = null;
        try {
            user = userCache.findUserByName(name);
        } catch (Exception e) {
            logger.error("get User by name:{} is error:", name, e);
        }
        model.addAttribute("user", user);
        return "user/userList";
    }

}
