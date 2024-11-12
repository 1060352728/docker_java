package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 功能描述:  权限测试
 *
 * @date: 2019/1/7 21:19
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/getDate")
    public String getDate() {
        return "这是一个Docker前后台部署测试";
    }

    @GetMapping("/getDate1")
    public String getDate1() {
        return "这是一个Docker前后台部署测试1111111";
    }
}
