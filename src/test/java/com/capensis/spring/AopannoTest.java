package com.capensis.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxg
 * @date 2023/2/22-21:23
 * @quotes 小不忍则乱大谋
 */
public class AopannoTest {
    @Test
    public void testAopAnno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopanno.xml");
        com.capensis.spring.aopanno.User user = context.getBean("user", com.capensis.spring.aopanno.User.class);
        user.add();
    }

    @Test
    public void testAopXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aspectj.xml");
        com.capensis.spring.aopxml.Book book = context.getBean("book", com.capensis.spring.aopxml.Book.class);
        book.buy();
    }
}
