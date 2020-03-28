package com.wisely.highlight_spring4.ch2.y05.event;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/28 19:54
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y05.event
 **/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布类
 * <p>
 * 1、注入ApplicationContext用来发布事件。
 * 2、使用ApplicationContext 的publishEvent方法开发布。
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext; //1

    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg)); //2
    }
}
