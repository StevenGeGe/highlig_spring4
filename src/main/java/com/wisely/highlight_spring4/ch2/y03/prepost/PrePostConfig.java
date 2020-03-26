package com.wisely.highlight_spring4.ch2.y03.prepost;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/26 16:19
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y03.prepost
 * <p>
 * <p>
 * 初始化构建函数-BeanWayService
 * @Bean-init-method 初始化构造函数-JSR250WayService
 * jsr-init-method
 * jsr250-destroy-method
 * @Bean-destroy-method
 */


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * <p>
 * 1、initMethod 和 destroyMethod 指定BeanWayService 类的init 和 destroy 方法在构造之后、Bean销毁之前执行。
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.y03.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean()
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}


/**
 *
 * 初始化构建函数-BeanWayService
 * @Bean-init-method
 * 初始化构造函数-JSR250WayService
 * jsr-init-method
 * jsr250-destroy-method
 * @Bean-destroy-method
 *
 * */
