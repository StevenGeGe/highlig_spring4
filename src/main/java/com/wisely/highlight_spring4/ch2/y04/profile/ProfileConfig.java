package com.wisely.highlight_spring4.ch2.y04.profile;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/27 16:15
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y04.profile
 **/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * profile 配置
 * <p>
 * 1、profile 为dev时，实例化DevDemoBean。
 * 2、profile 为prod时，实例化prodDemoBean。
 */
public class ProfileConfig {

    @Bean
    @Profile("dev") //1
    public DemoBean devDemoBean() {
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod") //2
    public DemoBean proDemoBean() {
        return new DemoBean("from production profile");
    }
}
