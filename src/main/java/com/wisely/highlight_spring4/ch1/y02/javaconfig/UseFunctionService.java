package com.wisely.highlight_spring4.ch1.y02.javaconfig;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/23 18:07
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.y02.javaconfig
 **/


/**
 * 1、此处没有使用@Service声明bean。
 * 2、此处没有使用@Autowired注解注入bean。
 * */
//1
public class UseFunctionService {
    //2
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String  SayHello(String wordUseFunctionService){
        return functionService.sayHello(wordUseFunctionService);
    }
}
