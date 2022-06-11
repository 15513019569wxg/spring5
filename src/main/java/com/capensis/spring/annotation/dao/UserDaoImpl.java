package com.capensis.spring.annotation.dao;

import com.capensis.spring.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author wxg
 * @date 2022/3/8-11:24
 * @quotes 小不忍则乱大谋
 */
@Repository(value="userDaoImpl")
public class UserDaoImpl implements UserDao{
    @Override
    public void printMessage() {
        System.out.println("userDaoImpl");
    }
}
