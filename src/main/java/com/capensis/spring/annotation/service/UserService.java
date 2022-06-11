package com.capensis.spring.annotation.service;

import com.capensis.spring.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wxg
 * @date 2022/3/8-11:06
 * @quotes 小不忍则乱大谋
 */

@Component(value="userService")
public class UserService {
    @Value(value = "宋江")
    private String name;
//    @Autowired
//    @Qualifier(value = "userDaoImpl")
//    @Resource
    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    public void printMessage(){
        System.out.println("userService" + " :: " + name);
        userDao.printMessage();
     }
}
