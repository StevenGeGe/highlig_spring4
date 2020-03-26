package com.wisely.highlight_spring4.ch1.y02.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/23 18:18
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.y02.javaconfig
 **/
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("java config main"));
        context.close();
    }
}
