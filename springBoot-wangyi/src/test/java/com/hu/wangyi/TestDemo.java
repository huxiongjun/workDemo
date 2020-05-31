package com.hu.wangyi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 19:11
 * @description 测试
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDemo {
    @Test
    public void fun01(){
        System.out.println("test");
        UUID guid = UUID.randomUUID();
        UUID panzhizhi = UUID.fromString("panzhizhi");
        System.out.println(panzhizhi);
        System.out.println(guid);

    }
}
