package com.wisely.highlight_spring4.ch3.y02.taskexecutor;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/1 17:40
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y07.taskexecutor
 **/

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 配置类
 * <p>
 * 1、利用@EnableAsync 注解开启异步任务支持
 * 2、配置类实现AsyncConfigurer 接口并重写，getAsyncExecutor 方法，
 * 并返回一个ThreadPoolTaskExecutor，这样我们就获得了一个基于线程池TaskExecutor。
 */

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.y02.taskexecutor")
//@EnableScheduling  //1
//@EnableAsync //1 //会报错
public class TaskExecutorConfig implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {  //2
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();

        taskExecutor.setCorePoolSize(5);              //线程池维护线程最少数量
        taskExecutor.setMaxPoolSize(10);              //线程池维护线程的最大数量。
        taskExecutor.setQueueCapacity(25);            //线程池所用的缓冲队列
        //  taskExecutor.setKeepAliveSeconds(30000);  //线程池维护线程所允许的空闲时间
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
