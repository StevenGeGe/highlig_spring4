package com.wisely.highlight_spring4.ch3.y03.taskScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/2 11:28
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y03.taskScheduler
 **/

/**
 * 计划任务执行类
 * <p>
 * 1、通过@Scheduled 声明该方法是计划任务，使用fixedRate 属性每隔固定时间执行。
 * 2、使用 cron 属性可按照指定时间执行，本例指的是 每天11点28分执行。
 * cron 是UNIX 和 类UNIX（linux） 系统下的定时任务。
 */

@Service
@Component
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)  //1
    public void reportCurrent() {
        System.out.println("每隔五秒执行一次 " + dateFormat.format(new Date()));
    }

    //@Scheduled(cron = "0 28 11 ? * *" )  //2
    @Scheduled(cron = "0 19 16 ? * *")  //2
    public void fixTmeExecution() {
        System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
    }

}
