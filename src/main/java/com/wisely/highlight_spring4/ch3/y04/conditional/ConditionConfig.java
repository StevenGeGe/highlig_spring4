package com.wisely.highlight_spring4.ch3.y04.conditional;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/7 17:34
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y04.conditional
 **/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * <p>
 * 1、通过@Conditional注解，符合Windows条件则实例化 WindowsListService 。
 * 2、通过@Conditional注解，符合linux条件则实例化   linuxListService 。
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class) //1
    public ListService windowsListServie() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)  //2
    public ListService linuxListService() {
        return new LinuxListService();
    }
}
