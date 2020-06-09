package com.imooc.diveinspringboot.externalized.configuration.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySources;

import java.util.HashMap;
import java.util.Map;

/**
 * 扩展 {@link PropertySources} {@link EnvironmentPostProcessor} 实现
 *
 * @author 小马哥
 * @since 2018-09-27
 */
public class ExtendPropertySourcesEnvironmentPostProcessor implements EnvironmentPostProcessor, Ordered {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        MutablePropertySources propertySources = environment.getPropertySources();
        Map<String, Object> source = new HashMap<>();
        // 1. from-environmentPrepared : 0
        // 2. from-ApplicationEnvironmentPreparedEvent : 9
        // 3. from-EnvironmentPostProcessor : 19
        // application.properties : 1
        // META-INF/default.properties : 7
        source.put("user.id", "19");
        MapPropertySource propertySource = new MapPropertySource("from-EnvironmentPostProcessor", source);
        propertySources.addFirst(propertySource);
    }

    @Override
    public int getOrder() {
        return ConfigFileApplicationListener.DEFAULT_ORDER - 1;
    }
}
