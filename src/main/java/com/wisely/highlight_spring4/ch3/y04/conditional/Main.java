package com.wisely.highlight_spring4.ch3.y04.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/7 17:42
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y04.conditional
 **/

/**
 * 运行类
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name")
                + "系统下的列表命令为 ："
                + listService.showListCmd());
    }
}
