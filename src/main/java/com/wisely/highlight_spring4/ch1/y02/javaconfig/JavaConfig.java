package com.wisely.highlight_spring4.ch1.y02.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jws.soap.SOAPBinding;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/23 18:11
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.y02.javaconfig
 **/


/**
 * 1、使用@Configuration注解表明当前类是一个配置类，这意味着这个类里可能有0个或者多个@Bean注解，
 *      此处没有使用包扫描，是因为所有的Bean都在此类中定义了。
 * 2、使用@Bean注解声明当前方法，FunctionService的返回值是一个Bean，Bean的名称时方法名。
 * 3、中国有人焉FunctionService的Bean的时候直接调用functionService（）。
 * 4、另一种注入的方式，直接将FunctionService作为参数给useFunctionService（），
 *       这也是spring容器提供的极好的功能。在spring容器中，只要容器中存在某个Bean，
 *       就可以在另外一个Bean的声明方法的参数中注入。
 *
 * */

@Configuration //1
public class JavaConfig {
    @Bean //2
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService()); //3
        return useFunctionService;
    }

//    @Bean
//    public UseFunctionService useFunctionService(FunctionService functionService){  //4
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(functionService);
//        return useFunctionService;
//    }
}
