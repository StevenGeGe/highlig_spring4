package com.wisely.highlight_spring4.ch2.y04.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/27 16:20
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y04.profile
 **/

/**
 * 测试类
 * <p>
 * 1、先将活动的profile 设置为prod。
 * 2、后注册Bean配置类，不然会报Bean 未定义的错误。
 * 3、刷新容器。
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //context.getEnvironment().setActiveProfiles("prod"); //1
        context.getEnvironment().setActiveProfiles("dev"); //1
        context.register(ProfileConfig.class);  //2
        context.refresh(); //3

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();

    }
}
