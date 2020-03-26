package com.wisely.highlight_spring4.ch1.y01.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/23 16:20
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.di
 **/


/***
 * 1、使用@Service注解声明当前UseFunctionService类是spring管理的一个bean。
 * 2、使用@Autowired将FunctionService的实体bean注入到UseFunctionService中，
 *    让UseFunctionService具备FunctionService的功能，
 *    此处使用JSR-330 的@Inject注解或者JSR-250的@Resource注解是等效的。
 *
 */



@Service //1
public class UseDiFunctionService {
    @Autowired //2
    DiFunctionService diFunctionService;

    public String SayHello(String word){
        return diFunctionService.sayHello(word);
    }



}
