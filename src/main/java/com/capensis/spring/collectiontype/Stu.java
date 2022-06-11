package com.capensis.spring.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wxg
 * @date 2022/3/7-21:54
 * @quotes 小不忍则乱大谋
 */
public class Stu {
    /**
        数组类型属性
     */
    private String[] courses;
    /**
     * 集合类型属性
     */
    private List<String> list;
    /**
     *   map 集合类型属性
     */
    private Map<String,String> maps;
    /**
     * set 集合类型属性
     */
    private Set<String> sets;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    /**
     * 课程列表
     * @param courseList 课程列表
     */
    private List<Course> courseList;

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void printStu(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
