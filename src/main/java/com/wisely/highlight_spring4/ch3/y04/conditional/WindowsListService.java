package com.wisely.highlight_spring4.ch3.y04.conditional;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/7 17:29
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y04.conditional
 **/

/**
 * 接口
 * <p>
 * windows下要创建的Bean的类。
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }
}
