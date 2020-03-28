package com.wisely.highlight_spring4.ch2.y05.event;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/28 19:23
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y05.event
 **/

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1l;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
