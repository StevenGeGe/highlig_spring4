package com.wisely.highlight_spring4.ch2.y03.prepost;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/26 16:07
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y03.prepost
 **/

/**
 * 使用@Bean的形式的Bean
 */

public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构建函数-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
