package com.hu.wangyi.controller;

import com.hu.wangyi.entity.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 19:00
 * @description 测试
 */
@RestController
@RequestMapping("/wangyi")
public class HelloController {
    @GetMapping("/test")
    public Object test(){
        return "hello";
    }
    @PostMapping("/comment")
    public Result findDisease(){
        return null;


    }
}
