package com.capensis.spring.bean;

/**
 * @author wxg
 * @date 2022/3/7-21:28
 * @quotes 小不忍则乱大谋
 */
public class Emp {
    private String ename;
    private String gender;
    /*
     *  员工属于某一个部门，使用对象形式表示
     */

    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printMessage(){
        System.out.println(ename + "::" + gender + "::" + dept);
    }
}
