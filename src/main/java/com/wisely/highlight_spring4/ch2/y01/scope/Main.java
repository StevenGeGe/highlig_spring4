package com.wisely.highlight_spring4.ch2.y01.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/25 17:04
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y01.scope
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService dss1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService dss2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService dps1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService dps2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1与s2是否相等：" + dss1.equals(dss2));
        System.out.println("p1与p2是否相等：" + dps1.equals(dps2));
        System.out.println();

        context.close();
    }
}

/*
* out
* s1与s2是否相等：true
* s1与s2是否相等：false
* */
