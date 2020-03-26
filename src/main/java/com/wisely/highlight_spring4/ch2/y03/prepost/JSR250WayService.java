package com.wisely.highlight_spring4.ch2.y03.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/26 16:13
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y03.prepost
 **/

/**
 * 使用JSR250形式的Bean
 * <p>
 * 1、@PostConstruct，在构造函数执行完之后执行
 * 2、@PreDestroy， 在Bean销毁之前执行。
 */

public class JSR250WayService {
    @PostConstruct //1
    public void init() {
        System.out.println("jsr-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy //2
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }

}
