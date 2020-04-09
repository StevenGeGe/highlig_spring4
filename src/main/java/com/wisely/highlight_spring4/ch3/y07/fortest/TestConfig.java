package com.wisely.highlight_spring4.ch3.y07.fortest;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/9 16:37
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y07.fortest
 **/


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 配置类
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("form development profile ");
    }

    @Bean
    @Profile("prod")
    public TestBean ProTestBean() {
        return new TestBean("form production profile ");
    }

}
