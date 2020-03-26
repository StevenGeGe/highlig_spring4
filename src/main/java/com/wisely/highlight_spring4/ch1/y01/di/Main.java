package com.wisely.highlight_spring4.ch1.y01.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/23 16:53
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.di
 **/

/**
 * 1、使用AnnotationConfigApplicationContext作为spring容器，接受一个配置类作为参数。
 * 2、获得声明配置的UseFunctionService的Bean。
 *
 *
 * */


public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class); //1

        UseDiFunctionService useDiFunctionService = context.getBean(UseDiFunctionService.class); //2
        System.out.println(useDiFunctionService.diFunctionService.sayHello("yingying"));

        context.close();

    }
}
