package com.capensis.spring;

import com.capensis.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxg
 * @date 2022/3/7-21:16
 * @quotes 小不忍则乱大谋
 */
public class ServiceTest {
    @Test
    public void test(){
        //1 加载 spring 配置文件
        ApplicationContext context =  new ClassPathXmlApplicationContext("bean2.xml");
        //2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        UserService userService2 = context.getBean("userService", UserService.class);
        System.out.println(userService);
        System.out.println(userService2);
        userService.add();
    }
}
