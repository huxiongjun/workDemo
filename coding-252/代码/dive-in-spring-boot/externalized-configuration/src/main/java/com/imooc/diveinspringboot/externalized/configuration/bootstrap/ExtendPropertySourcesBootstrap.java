package com.imooc.diveinspringboot.externalized.configuration.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySources;

/**
 * 扩展 {@link PropertySources} 引导类
 *
 * @author 小马哥
 * @since 2018-09-27
 */
@EnableAutoConfiguration
@Configuration
// @PropertySource
@PropertySource(name = "from classpath:META-INF/default.properties", value = "classpath:META-INF/default.properties")
public class ExtendPropertySourcesBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(ExtendPropertySourcesBootstrap.class)
                        .web(WebApplicationType.NONE) // 非 Web 应用
                        .properties("user.id=99")        // Default properties
                        .run(of("--user.id=88")); // Command line arguments.
        // 获取 Environment 对象
        ConfigurableEnvironment environment = context.getEnvironment();

        System.err.printf("用户id : %d\n", environment.getProperty("user.id", Long.class));

        environment.getPropertySources().forEach(propertySource -> {
            System.err.printf("PropertySource[名称:%s] : %s\n", propertySource.getName(), propertySource);
        });

        // 关闭上下文
        context.close();
    }

    private static <T> T[] of(T... args) {
        return args;
    }
}
