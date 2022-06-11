package com.capensis.spring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxg
 * @date 2022/3/7-18:37
 * @quotes 小不忍则乱大谋
 */
public class UserTest {
    @Test
    public void test(){
        //1 加载 spring 配置文件
        ApplicationContext context =  new ClassPathXmlApplicationContext("bean.xml");
        //2 获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        //1 加载 spring 配置文件
        ApplicationContext context =  new ClassPathXmlApplicationContext("bean.xml");
        //2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.printBookMessage();
    }

    @Test
    public void testOrders(){
        //1 加载 spring 配置文件
        ApplicationContext context =  new ClassPathXmlApplicationContext("bean.xml");
        //2 获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.printBookMessage();
    }
}
