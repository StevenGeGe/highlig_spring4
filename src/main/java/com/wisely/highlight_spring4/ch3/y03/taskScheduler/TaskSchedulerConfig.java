package com.wisely.highlight_spring4.ch3.y03.taskScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/2 17:49
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y03.taskScheeduler
 **/


/**
 * 配置类
 * <p>
 * 1、通过@EnableScheduling 注解开启对计划任务的支持
 */

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.y03.taskScheduler")
@EnableScheduling //1
public class TaskSchedulerConfig {
}
