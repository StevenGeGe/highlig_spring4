package com.wisely.highlight_spring4.ch3.y03.taskScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/2 11:28
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y03.taskScheeduler
 **/
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)  //1
    public void reportCurrent() {
        System.out.println("每隔五秒执行一次 " + dataFormat.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? * *")  //2
    public void fixTmeExecution() {
        System.out.println("在指定时间 " + dataFormat.format(new Date()));
    }

}
