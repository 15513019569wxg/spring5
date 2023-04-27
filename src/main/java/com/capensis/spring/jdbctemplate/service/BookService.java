package com.capensis.spring.jdbctemplate.service;

import com.capensis.spring.jdbctemplate.dao.BookDao;
import com.capensis.spring.jdbctemplate.entity.Book2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wxg
 * @date 2023/2/23-21:33
 * @quotes 小不忍则乱大谋
 * @desc
 */
@Service
public class BookService {
    // 注入dao
    @Autowired
    private BookDao bookDao;

    public void addUser(Book2 user){
       bookDao.add(user);
    }

    public void updateUser(Book2 user){
        bookDao.updateBook(user);
    }

    public void deleteUser(String id){
        bookDao.deleteBook(id);
    }

    public int findCount() {
        return bookDao.selectCount();
    }

    public Book2 findOne(String id){
        return bookDao.findBook2Info(id);
    }

    // 查询返回集合
    public List<Book2> findAll(){return bookDao.findAllBook();}

    // 批量添加
    public void batchAdd(List<Object[]> batchArags){
        bookDao.batchAddBook(batchArags);
    }

    // 批量修改
    public void batchUpdate(List<Object[]> batchArags){
        bookDao.batchUpdateBook(batchArags);
    }

    // 批量删除
    public void batchDelete(List<Object[]> batchArags){
        bookDao.batchDeleteBook(batchArags);
    }
}
