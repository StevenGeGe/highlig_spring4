package com.wisely.highlight_spring4.ch1.y02.javaconfig;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/23 18:04
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.y02.javaconfig
 **/


/**
 * 1、此处没有使用@Service声明bean。
 *
 * */


//1
public class FunctionService {
    public String sayHello(String wordFunctionService){
        return "hello " + wordFunctionService + " ,this is java config service!";
    }
}
