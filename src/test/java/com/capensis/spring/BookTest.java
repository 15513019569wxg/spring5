package com.capensis.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxg
 * @date 2022/3/8-0:04
 * @quotes 小不忍则乱大谋
 */
public class BookTest {
    @Test
    public void test(){
        final ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("InjectPublicCollection.xml");
        final com.capensis.spring.collectiontype.Book collectionBook = classPathXmlApplicationContext.getBean("collectionBook", com.capensis.spring.collectiontype.Book.class);
        collectionBook.printMessage();
    }
}
