package com.wisely.highlight_spring4.ch3.y01.aware;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/28 22:21
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y06.aware
 **/

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 演示类
 * <p>
 * 1、实现BeanNameAware ，ResourceLoaderAware接口，获得Bean名称和资源加载的服务。
 * 2、实现ResourceLoaderAware 需要重写SetResourceLoader.
 * 3、实现BeanNameAware 需要重写setBeanName 方法。
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {  //1

    private String beanName;
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {  //2
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void setBeanName(String beanName) {  //3
        this.beanName = beanName;
    }

    public void outputResult() {
        System.out.println("Bean 的名称为 ： " + beanName);
        Resource resource =
                resourceLoader.getResource("classpath:com/wisely/highlight_spring4/ch3/y01/aware/AwareTest.txt");
        try {
            System.out.println("ResourceLoader 加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));  //4
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
