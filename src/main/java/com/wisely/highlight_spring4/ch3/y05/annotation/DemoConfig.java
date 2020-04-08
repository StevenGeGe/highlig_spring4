package com.wisely.highlight_spring4.ch3.y05.annotation;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/8 15:59
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y05.annotation
 **/

/**
 * 新的配置类
 * <p>
 * 1、使用@WiselyConfiguration 组合注解替代@Configuration 和 @ComponentScan 。
 */

@WiselyConfiguration("com.wisely.highlight_spring4.ch3.y05.annotation")  //1
public class DemoConfig {
}
