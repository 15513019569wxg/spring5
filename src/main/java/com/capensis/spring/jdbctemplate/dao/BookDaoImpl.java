package com.capensis.spring.jdbctemplate.dao;

import com.capensis.spring.jdbctemplate.entity.Book2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author wxg
 * @Date 2023/2/23-21:35
 * @quotes 小不忍则乱大谋
 * @desc
 */
@SuppressWarnings("ALL")
@Repository
public class BookDaoImpl implements BookDao{

    // 注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book2 book2) {
        String sql = "insert into user values(?, ?, ?)";
        Object[] args = {book2.getUserId(), book2.getUsername(), book2.getUstatus()};
        final int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void updateBook(Book2 user) {
        String sql = "update user set username = ?, ustatus = ? where user_id = ?";
        Object[] args = {user.getUsername(), user.getUstatus(), user.getUserId()};
        final int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void deleteBook(String id) {
        String sql = "delete from user where user_id = ?";
        final int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
       String sql = "select count(*) from user";
        final Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;

    }

    @Override
    public Book2 findBook2Info(String id) {
        String sql = "select * from user where user_id = ?";
        final Book2 book2 = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book2>(Book2.class), id);
        return book2;
    }

    @Override
    public List<Book2> findAllBook() {
        String sql = "select * from user";
        final List<Book2> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book2>(Book2.class));
        // 调用方法
        return bookList;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArags) {
        String sql = "insert into user values(?, ?, ?)";
        final int[] ints = jdbcTemplate.batchUpdate(sql, batchArags);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArags) {
        String sql = "update user set username = ?, ustatus = ? where user_id = ?";
        final int[] ints = jdbcTemplate.batchUpdate(sql, batchArags);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteBook(List<Object[]> batchArags) {
        String sql = "delete from user where user_id = ?";
        final int[] ints = jdbcTemplate.batchUpdate(sql, batchArags);
        System.out.println(Arrays.toString(ints));

    }
}
