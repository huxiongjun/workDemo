package com.imooc.diveinspringboot.externalized.configuration.bootstrap;

import com.imooc.diveinspringboot.externalized.configuration.domain.User;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Locale;

/**
 * {@link ConfigurationProperties @ConfigurationProperties} 注解引导类
 *
 * @author 小马哥
 * @since 2018-09-25
 */
@EnableAutoConfiguration
@EnableConfigurationProperties
public class ConfigurationPropertiesBootstrap {

    @Bean
    @ConfigurationProperties(prefix = "user")
    @ConditionalOnProperty(prefix = "user.",name = "city.post_code", matchIfMissing = false, havingValue = "0571")
    public User user() {
        return new User();
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(ConfigurationPropertiesBootstrap.class)
                        .web(WebApplicationType.NONE) // 非 Web 应用
                        .run(args);

//        User user = context.getBean("user", User.class);
        User user = context.getBean(User.class);

        System.err.println("用户对象 : " + user);

        // 关闭上下文
        context.close();
    }
}
