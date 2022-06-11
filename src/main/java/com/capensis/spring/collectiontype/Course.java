package com.capensis.spring.collectiontype;

/**
 * @author wxg
 * @date 2022/3/7-23:27
 * @quotes 小不忍则乱大谋
 */
public class Course {
    /**
     * 课程名称
     */
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" + "cname='" + cname + '\'' + '}';
    }
}
