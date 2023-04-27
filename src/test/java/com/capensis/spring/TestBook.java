package com.capensis.spring;

import com.capensis.spring.jdbctemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @Test
    public void testJdbcTemplates() {
         ApplicationContext context = new ClassPathXmlApplicationContext("jdbctemplate.xml");
         BookService bookService = context.getBean("bookService", BookService.class);

         // 增加
//        Book2 user = new Book2();
//        user.setUserId("1");
//        user.setUsername("java");
//        user.setUstatus("a");
//        bookService.addUser(user);
//
//
//        // 更新
//        Book2 user2 = new Book2();
//        user.setUserId("1");
//        user.setUsername("javaupdate");
//        user.setUstatus("a");
//        bookService.updateUser(user);

        // 删除
        //bookService.deleteUser("1");

        // 查询结果返回某个值
//        final int count = bookService.findCount();
//        System.out.println(count);

        // 查询对象信息
//        final Book2 one = bookService.findOne("2");
//        System.out.println(one);

        // 查询对象集合信息
//        final List<Book2> all = bookService.findAll();
//        System.out.println(all);

        // 批量添加
//        final List<Object[]> batchArags = new ArrayList<>();
//        Object[] o1 = {"3", "java", "a"};
//        Object[] o2 = {"4", "c++", "b"};
//        Object[] o3 = {"5", "Mysql", "c"};
//        batchArags.add(o1);
//        batchArags.add(o2);
//        batchArags.add(o3);
//
//        // 调用批量添加
//        bookService.batchAdd(batchArags);


//        final List<Object[]> batchArags = new ArrayList<>();
//        Object[] o1 = {"javaupdate", "a", "3"};
//        Object[] o2 = {"c++update", "b", "4"};
//        Object[] o3 = {"Mysqlupdate", "c", "5"};
//        batchArags.add(o1);
//        batchArags.add(o2);
//        batchArags.add(o3);
//
//        // 调用批量添加
//        bookService.batchUpdate(batchArags);


        final List<Object[]> batchArags = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArags.add(o1);
        batchArags.add(o2);
        // 调用批量添加
        bookService.batchDelete(batchArags);
    }
}


