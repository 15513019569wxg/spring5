package com.capensis.spring.service;

import com.capensis.spring.dao.UserDao;

/**
 * @author wxg
 * @date 2022/3/7-21:10
 * @quotes 小不忍则乱大谋
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service");
        userDao.update();
    }


}
