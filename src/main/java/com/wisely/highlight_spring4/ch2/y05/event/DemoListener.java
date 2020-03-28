package com.wisely.highlight_spring4.ch2.y05.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/28 19:29
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y05.event
 **/


/**
 * 事件监听器
 * <p>
 * 1、实现ApplicationListener接口，并指定监听的事件类型。
 * 2、使用onApplicationEvent方法对消息进行接受处理。
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {  //1

    public void onApplicationEvent(DemoEvent demoEvent) { //2
        String msg = demoEvent.getMsg();

        System.out.println("我(Bean-demoListener)接收到了Bean-demoPublisher发布的消息：" + msg);
    }
}
