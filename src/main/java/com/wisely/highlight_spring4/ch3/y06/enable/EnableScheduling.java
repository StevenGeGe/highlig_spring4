package com.wisely.highlight_spring4.ch3.y06.enable;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/8 17:04
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y06.enable
 **/

import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 第一类：直接导入配置类
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(SchedulingConfiguration.class)
public @interface EnableScheduling {
}
