package com.wisely.highlight_spring4.ch2.y02.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/26 10:43
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y02.el
 **/

/**
 * 需要被注入的Bean
 *
 * 1、此处为注入普通字符串
 *
 * */

@Service
public class DemoEiService {
    @Value("其他类的属性")  //1
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }

}
