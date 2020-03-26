package com.wisely.highlight_spring4.ch2.y02.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/26 11:32
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y02.el
 **/



public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = annotationConfigApplicationContext.getBean(ElConfig.class);
        resourceService.outPutResource();

        annotationConfigApplicationContext.close();
    }
}
