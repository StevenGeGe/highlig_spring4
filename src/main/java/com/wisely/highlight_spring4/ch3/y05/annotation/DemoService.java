package com.wisely.highlight_spring4.ch3.y05.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/8 15:56
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y05.annotation
 **/

/**
 * 演示服务Bean
 */

@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置照样获得的Bean ");
    }
}
