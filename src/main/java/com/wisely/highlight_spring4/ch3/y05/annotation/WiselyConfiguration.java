package com.wisely.highlight_spring4.ch3.y05.annotation;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/8 15:48
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y05.annotation
 **/


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 事例组合注解
 * <p>
 * 1、组合@Configuration元注解。
 * 2、组合@ComponentScan 元注解。
 * 3、覆盖value 参数。
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration  //1
@ComponentScan  //2
public @interface WiselyConfiguration {

    String[] value() default {}; //3
}
