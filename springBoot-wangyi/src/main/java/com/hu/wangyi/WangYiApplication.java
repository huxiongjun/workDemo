package com.hu.wangyi;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;


/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 18:55
 * @description 启动类
 */
@SpringBootApplication
@MapperScan("com.hu.wangyi.mapper") //扫描的mapper
@EnableScheduling
@EnableAsync // 启用线程池异步支持
public class WangYiApplication {
    public static void main(String[] args) {
        SpringApplication.run(WangYiApplication.class, args);
    }
    @Bean // 注入restTemplate
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
