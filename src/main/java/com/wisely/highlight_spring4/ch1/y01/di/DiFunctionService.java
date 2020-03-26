package com.wisely.highlight_spring4.ch1.y01.di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/23 16:11
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.di
 **/

/**
 * 1、当前功能类的bean。
 * 2、使用@Service 注解声明当前FunctionService 类是spring管理的一个Bean。
 * 3、使用@Component，@Service，@Repository，@Controller是等效的，可根据需要使用。
 *
 * */

@Service
public class DiFunctionService {
    public String sayHello(String word) {
        return "hello " + word + "!";
    }
}
