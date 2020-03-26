package com.wisely.highlight_spring4.ch1.y03.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/24 15:24
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch1.y03.aop
 **/

/**
 * 1、通过@Aspect注解声明一个切面。
 * 2、通过@Component 让此切面成为spring 容器管理的Bean。
 * 3、通过@PointCut注解声明切点。
 * 4、通过@After注解声明一个建言，并使用@PointCut定义的切点。
 * 5、通过反射可获得注解上的属性，然后做日志记录相关的操作，下面相同。
 * 6、通过@Before 注解声明一个建言，此建言直接使用拦截规则作为参数。
 *
 * */


@Aspect     //1
@Component  //2
public class LogAspect {

    @Pointcut("@annotation(com.wisely.highlight_spring4.ch1.y03.aop.Action)") //3
    public void annotationPointCut() { };

    @After("annotationPointCut()") //4
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截，" + action.name());  //5
    }

    @Before("execution(* com.wisely.highlight_spring4.ch1.y03.aop.DemoMethodService.*(..))")  //6
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截，" + method.getName());

    }
}
