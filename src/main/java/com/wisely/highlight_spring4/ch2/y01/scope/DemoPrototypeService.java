package com.wisely.highlight_spring4.ch2.y01.scope;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/25 17:01
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y01.scope
 **/

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 编写Prototype的Bean。
 *
 * 1、声明Scope的Prototype。
 *
 * */

@Service
@Scope("prototype") //1
public class DemoPrototypeService {
}
