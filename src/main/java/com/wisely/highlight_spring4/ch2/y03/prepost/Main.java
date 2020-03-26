package com.wisely.highlight_spring4.ch2.y03.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/26 16:25
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y03.prepost
 **/

/**
 * 对比java配置 Bean的方式， 注解配置Bean的方式的，创建和销毁前后顺序
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }
}
