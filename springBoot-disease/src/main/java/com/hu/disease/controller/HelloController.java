package com.hu.disease.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 19:00
 * @description 测试
 */
@RestController
@RequestMapping("/test")
public class HelloController {
    @GetMapping
    public Object test(){
        return "hello";
    }
}
