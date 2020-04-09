package com.wisely.highlight_spring4.ch3.y07.fortest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Runwith;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2020/4/9 16:44
 * @Version 1.0
 * @PACKAGE_NAME : com.wisely.highlight_spring4.ch3.y07.fortest
 **/

/**
 *
 * */
@RunWith()
public class DemoBeanIntegrationTests {

    @Autowired  //4
    private TestBean testBean;

    @Test  //5
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
