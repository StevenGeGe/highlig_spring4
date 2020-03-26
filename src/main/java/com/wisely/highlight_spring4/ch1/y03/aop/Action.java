package com.wisely.highlight_spring4.ch1.y03.aop;

import java.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/24 15:12
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.y03.aop
 **/



/**
 *
 * 1、注解本身是 没有功能的，就和xml一样。
 *    注解和xml都是一种元数据，元数据即解释数据的数据，这就是所谓的配置。
 * 2、注解的功能来自用这个注解的地方。
 *
 * 3、如果没有@Documented，注解的话，在logAspect里面会报错，无法转成相应的对象。
 *
 * */

/** 拦截规则的注解 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented  //3
public @interface  Action {
    String name();
}
