package com.wisely.highlight_spring4.ch2.y04.profile;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/27 16:11
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y04.profile
 **/

/**
 * 演示Bean
 */
public class DemoBean {

    private String content;

    public DemoBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
