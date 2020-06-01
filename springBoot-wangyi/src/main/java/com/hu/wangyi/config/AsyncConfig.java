package com.hu.wangyi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/31 0:44
 * @description TODO
 */
@Configuration
public class AsyncConfig implements AsyncConfigurer {
    @Nullable
    @Override
    public Executor getAsyncExecutor() {
        //定义线程池
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        //核心线程数
        taskExecutor.setCorePoolSize(20);// 默认是8个。
        //线程池最大线程数
        taskExecutor.setMaxPoolSize(40); //设置线程池最大线程数  如果超过次数，则拒绝执行。该值可以根据业务自行设置
        //线程队列最大线程数
        taskExecutor.setQueueCapacity(10);//线程队列最大线程数
        //初始化
        taskExecutor.initialize();
        return taskExecutor;
    }
}
