package com.capensis.spring.bean;

/**
 * @author wxg
 * @date 2022/3/7-21:28
 * @quotes 小不忍则乱大谋
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" + "dname='" + dname + '\'' + '}';
    }
}
