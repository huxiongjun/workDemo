package com.imooc.diveinspringboot.externalized.configuration.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 外部化配置属性源{@link PropertySource} 顺序测试用例
 *
 * @author 小马哥
 * @since 2018-09-26
 */
@RunWith(SpringRunner.class)
@TestPropertySource(
//        properties = "user.id=9",
        locations = "classpath:META-INF/default.properties")
@SpringBootTest(
//        properties = "user.id=8",
        classes = {PropertySourceOrderTest.class},
        webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Configuration
@org.springframework.context.annotation.PropertySource(name = "test-property-source", value = "classpath:META-INF/test.properties")
public class PropertySourceOrderTest {

    @Value("${user.id}")
    private Long userId;

    @Autowired
    private ConfigurableEnvironment environment;

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Test
    public void testEnvironment() {
        Assert.assertSame(applicationContext.getEnvironment(), environment);
    }

    @Test
    public void testUserId() {
        Assert.assertEquals(new Long(7), userId);
    }

    @Test
    public void testPropertySources() {
        environment.getPropertySources().forEach(propertySource -> {
            System.out.printf("PropertySource[名称:%s] : %s\n", propertySource.getName(), propertySource);
            System.out.println();
        });
    }
}
