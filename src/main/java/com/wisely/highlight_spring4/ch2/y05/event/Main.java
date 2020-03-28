package com.wisely.highlight_spring4.ch2.y05.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/28 20:01
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y05.event
 **/
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event ");

        context.close();
    }
}
