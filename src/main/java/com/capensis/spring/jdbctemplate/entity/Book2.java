package com.capensis.spring.jdbctemplate.entity;

/**
 * @author wxg
 * @date 2023/2/23-21:41
 * @quotes 小不忍则乱大谋
 * @desc
 */
public class Book2 {
    private String userId;
    private String username;
    private String ustatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }


}
