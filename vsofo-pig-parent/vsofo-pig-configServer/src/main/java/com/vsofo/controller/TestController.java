package com.vsofo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/15 14:09
 * @description 测试
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public String test() {
        return "test";
    }
}
