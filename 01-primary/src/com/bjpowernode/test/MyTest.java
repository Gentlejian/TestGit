package com.bjpowernode.test;

import com.bjpowernode.beans.Student;
import com.bjpowernode.dao.IStudentDao;
import com.bjpowernode.dao.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 张剑锋
 * @date 2019/6/11 - 22:02
 */
public class MyTest {

    private IStudentDao dao;

    @Before
    public void before() {
        dao = new StudentDaoImpl();

    }

    @Test
    public void testInsert() {
        Student student = new Student("张三",23,93.5);
        dao.insertStu(student);
    }
}
