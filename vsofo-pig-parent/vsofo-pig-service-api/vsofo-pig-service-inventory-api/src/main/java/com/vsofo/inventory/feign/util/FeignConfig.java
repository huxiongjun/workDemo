package com.vsofo.inventory.feign.util;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/14 14:26
 * @description 记录日志
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
    // Feign支持4中级别：
    // NONE：不记录任何日志，默认值
    // BASIC：仅记录请求的方法，URL以及响应状态码和执行时间
    // HEADERS：在BASIC基础上，额外记录了请求和响应的头信息
    // FULL：记录所有请求和响应的明细，包括头信息、请求体、元数据
}
