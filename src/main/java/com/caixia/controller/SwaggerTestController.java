package com.caixia.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: LiChaoChao
 * @date: 2018-11-27
 */
@Api(value = "SwaggerTestController")
@RestController
@RequestMapping("/swagger")
public class SwaggerTestController {

    @ApiOperation(value = "sayHello" , notes = "打个招呼")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(HttpRequest request) {
        System.out.println(request.toString());
        return "hello, Swagger";
    }

}
