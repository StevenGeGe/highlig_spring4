package com.wisely.highlight_spring4.ch2.y04.profile;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;


/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/3/26 17:54
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch2.y04.profile
 **/
public class WebInit implements WebApplicationInitializer {

    public void onStartup(ServletContext container) throws ServletException {
        container.setInitParameter("spring.profiles.default", "dev");
    }

}
