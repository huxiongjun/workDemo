package com.vsofo.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/15 9:42
 * @description 测试是否能够拿到配置
 */
@RestController
@RequestMapping("/env")
@RefreshScope //用于启用刷新配置文件的信息
public class EnvController {
    @Value("${env}")
    private String env;

    @GetMapping
    public String test() {
        return env;
    }
}
