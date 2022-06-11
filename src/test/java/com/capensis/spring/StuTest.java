package com.capensis.spring;

import com.capensis.spring.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxg
 * @date 2022/3/7-23:04
 * @quotes 小不忍则乱大谋
 */
public class StuTest {
   @Test
    public void test(){
       final ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("collectiontype.xml");
       final Stu stu = classPathXmlApplicationContext.getBean("stu", Stu.class);
       stu.printStu();
   }


}
