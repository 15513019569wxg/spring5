package com.capensis.spring;

import com.capensis.spring.lifecycle.MyBook;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxg
 * @date 2022/3/8-9:11
 * @quotes 小不忍则乱大谋
 */
public class MyBookTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        MyBook myBook = context.getBean("myBook", MyBook.class);
        System.out.println("第四步 获取创建 bean 实例对象");
        System.out.println(myBook);
        //手动让 bean 实例销毁
        context.close();
    }

}
