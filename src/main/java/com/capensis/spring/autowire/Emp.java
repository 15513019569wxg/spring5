package com.capensis.spring.autowire;

/**
 * @author wxg
 * @date 2022/3/8-10:10
 * @quotes 小不忍则乱大谋
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" + "dept=" + dept + '}';
    }

    public void printMessage(){
        System.out.println(dept);
    }
}
