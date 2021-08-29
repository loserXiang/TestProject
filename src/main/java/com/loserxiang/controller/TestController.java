package com.loserxiang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @Author loserxiang
 * @Date 2021/8/29 11:02
 * @Version 1.0
 */
@RestController
public class TestController {
    @GetMapping("/hello") //该注解等现于spring中的@RequestMapping(RequestMethod.GET)
    public String hello(){
        return "Hello Spring Boot!";
    }
}
