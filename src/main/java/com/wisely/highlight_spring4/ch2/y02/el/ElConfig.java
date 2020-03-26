package com.wisely.highlight_spring4.ch2.y02.el;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/26 10:49
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y02.el
 **/


import org.apache.commons.io.IOUtils;
//调用此jar包 会报错
//import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * 演示配置类
 * <p>
 * 1、注入普通字符串
 * 2、注入操作系统属性
 * 3、注入表达式结果
 * 4、注入其它Bean的属性
 * 5、注入文件资源
 * 6、注入网址资源
 * 7、注入配置文件
 * <p>
 * 注入配置配件需使用 @PropertySource指定文件地址，
 * 若使用@Value注入，则要配置一个PropertySourcesPlaceholderConfigurer 的Bean。
 * 注意，@Value("${book.name}") 使用的是 “$”*  而不是 “#”
 * <p>
 * 注入的Properties 还可以从Environment中获得。
 */


@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.y02.el")
@PropertySource("classpath:com/wisely/highlight_spring4/ch2/y02/el/test.properties") //7
public class ElConfig {
    @Value("I love you!")  //1
    private String normal;

    //No ending suffix '}' for expression starting at character 0: #{systemProperties{'os.name'}
    //@Value("#{systemProperties{'os.name'}")  //会报错
    @Value("#{systemProperties['os.name']}")   //2
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0 }")   //3
    private double randomNumber;

    @Value("#{demoEiService.another}")   //4
    private String fromAnother;

    @Value("classpath:com/wisely/highlight_spring4/ch2/y02/el/test.txt")  //5
    private Resource testFile;

    @Value("http://www.baidu.com")  //6
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;  //7


    @Bean  //7
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


    public void outPutResource() {
        try {
            System.out.println(normal);
            System.out.println("the system  is " + osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);

            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

