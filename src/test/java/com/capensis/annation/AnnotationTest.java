package com.capensis.annation;

import com.capensis.spring.annotation.config.SpringConfig;
import com.capensis.spring.annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author wxg
 * @date 2022/3/8-11:07
 * @quotes 小不忍则乱大谋
 */
public class AnnotationTest {
    @Test
    public void test(){
        final ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("annotation.xml");
        final UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        userService.printMessage();
    }

    @Test
    public void testField(){
        final ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("annotation.xml");
        final UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        userService.printMessage();
    }

    @Test
    public void testConfig(){
        final AnnotationConfigApplicationContext classPathXmlApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        final UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        userService.printMessage();
    }
}
