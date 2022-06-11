package com.capensis.spring.factorybean;

import com.capensis.spring.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author wxg
 * @date 2022/3/8-8:28
 * @quotes 小不忍则乱大谋
 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        final Course course = new Course();
        course.setCname("spring5");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
