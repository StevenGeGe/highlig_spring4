package com.wisely.highlight_spring4.ch2.y07.taskexecutor;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/1 18:11
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y07.taskexecutor
 **/

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        //for (int i=0; i<20; i++){
        for (int i = 0; i < 200; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
