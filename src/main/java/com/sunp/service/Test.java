package com.sunp.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunpeng
 * @time 2018/8/7 15:02
 * @description
 */
public class Test {



    @org.junit.Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestXmlLoadBean bean = ac.getBean(TestXmlLoadBean.class);
        String test = bean.getTest();
        System.out.println(test);

    }
}
