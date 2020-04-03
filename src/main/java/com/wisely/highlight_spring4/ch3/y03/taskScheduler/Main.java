package com.wisely.highlight_spring4.ch3.y03.taskScheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/2 17:53
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y03.taskScheeduler
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);

    }
}
