package com.capensis.spring;

import com.capensis.spring.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxg
 * @date 2022/3/7-21:31
 * @quotes 小不忍则乱大谋
 */
public class EmpTest {
    @Test
    public void test(){
        //1 加载 spring 配置文件
        ApplicationContext context =  new ClassPathXmlApplicationContext("bean3.xml");
        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.printMessage();
    }

    @Test
    public void testCascade(){
        //1 加载 spring 配置文件
        ApplicationContext context =  new ClassPathXmlApplicationContext("bean3Cascade.xml");
        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.printMessage();
    }
}
