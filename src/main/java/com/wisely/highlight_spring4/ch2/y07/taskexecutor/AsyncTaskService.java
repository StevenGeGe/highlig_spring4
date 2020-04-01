package com.wisely.highlight_spring4.ch2.y07.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/1 18:06
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y07.taskexecutor
 **/

/**
 * 任务执行类
 * <p>
 * 1、通过 @Async 注解表明该方法是个异步方法，如果注解在类级别，
 * 则表明该类所有的方法都是异步方法 ，而这里的方法自动被注入使用ThreadPoolTaskExecutor
 * 作为TaskExecutor。
 */
@Service
public class AsyncTaskService {

    @Async  //1
    public void executeAsyncTask(Integer integer) {
        System.out.println("执行异步任务 ：" + integer);
    }

    @Async
    public void executeAsyncTaskPlus(Integer integer) {
        System.out.println("执行异步任务 +1 ：" + (integer + 1));
    }

}
