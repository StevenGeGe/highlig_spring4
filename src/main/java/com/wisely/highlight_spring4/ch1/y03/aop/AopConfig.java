package com.wisely.highlight_spring4.ch1.y03.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/24 15:51
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.y03.aop
 **/


/**
 * 1、配置类
 *
 * 2、使用@EnableAspectJAutoProxy 注解开启Spring对AspectJ的支持。
 *
 * */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.y03.aop")
@EnableAspectJAutoProxy //1
public class AopConfig {
}
