package com.capensis.spring.jdbctemplate.dao;

import com.capensis.spring.jdbctemplate.entity.Book2;

import java.util.List;

/**
 * @author wxg
 * @date 2023/2/23-21:33
 * @quotes 小不忍则乱大谋
 * @desc
 */
public interface BookDao {

    void add(Book2 user);

    void updateBook(Book2 user);

    void deleteBook(String id);

    int selectCount();

    Book2 findBook2Info(String id);

    List<Book2> findAllBook();

    // 批量添加
    void batchAddBook(List<Object[]> batchArags);

    // 批量修改
    void batchUpdateBook(List<Object[]> batchArags);

    // 批量删除
    void batchDeleteBook(List<Object[]> batchArags);


}
