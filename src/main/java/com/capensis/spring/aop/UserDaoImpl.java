package com.capensis.spring.aop;

/**
 * @author wxg
 * @date 2022/3/16-15:28
 * @quotes 小不忍则乱大谋
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("------------add----------");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("------------update----------");
        return id;
    }
}
