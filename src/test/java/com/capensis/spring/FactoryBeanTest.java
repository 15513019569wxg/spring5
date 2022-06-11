package com.capensis.spring;

import com.capensis.spring.collectiontype.Course;
import com.capensis.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxg
 * @date 2022/3/8-8:30
 * @quotes 小不忍则乱大谋
 */
public class FactoryBeanTest {
    @Test
    public void test(){
        //1 加载 spring 配置文件
        ApplicationContext context =  new ClassPathXmlApplicationContext("factorybean.xml");
        //2 获取配置创建的对象
       Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
}
