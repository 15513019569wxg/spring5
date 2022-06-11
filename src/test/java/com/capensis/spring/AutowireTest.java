package com.capensis.spring;

import com.capensis.spring.autowire.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author wxg
 * @date 2022/3/8-10:16
 * @quotes 小不忍则乱大谋
 */
public class AutowireTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        Emp emp= context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.printMessage();
    }

}
