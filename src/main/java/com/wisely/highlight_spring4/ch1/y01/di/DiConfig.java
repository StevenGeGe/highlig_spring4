package com.wisely.highlight_spring4.ch1.y01.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/23 16:48
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.di
 **/

/**
 * 1、@Configuration 声明当前类是一个配置类
 * 2、使用@ComponentScan,自动扫描包名下所有使用@Service，@Repository和@Controller 的类，
 *    并注册为Bean。
 *
 * 3、在更改包名时，@ComponentScan里面配置的路径不会自动更改，调用的时候会提示
 *
 * Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.wisely.highlight_spring4.ch1.y01.di.UseDiFunctionService' available
 * 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:351)
 * 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:342)
 * 	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1126)
 * 	at com.wisely.highlight_spring4.ch1.y01.di.Main.main(DemoBeanIntegrationTests.java:27)
 *
 * */

@Configuration //1
@ComponentScan("com.wisely.highlight_spring4.ch1.y01.di") //2
public class DiConfig {
}
