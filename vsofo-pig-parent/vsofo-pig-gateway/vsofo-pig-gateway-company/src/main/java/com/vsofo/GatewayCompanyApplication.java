package com.vsofo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/12 17:42
 * @description 集团登录网关
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayCompanyApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayCompanyApplication.class, args);
    }

    /**
     * 限流
     */
    @Bean(name = "ipKeyResolver")
    public KeyResolver userKeyResolver() {
        return new KeyResolver() {
            @Override
            public Mono<String> resolve(ServerWebExchange exchange) {
                // 获取远程客户端IP
                String hostAddress =
                        exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();
                System.out.println("hostName:" + hostAddress);
                return Mono.just(hostAddress);
            }
        };
    }

}
