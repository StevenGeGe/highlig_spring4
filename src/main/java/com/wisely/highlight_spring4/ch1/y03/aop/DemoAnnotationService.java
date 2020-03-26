package com.wisely.highlight_spring4.ch1.y03.aop;

import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/24 15:18
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.y03.aop
 **/

/**
 * 1、使用注解的被拦截的类。
 *
 * */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}

}
