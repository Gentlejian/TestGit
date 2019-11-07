package com.bjpowernode.test;

import com.bjpowernode.beans.Student;
import com.bjpowernode.dao.IStudentDao;
import com.bjpowernode.dao.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

import javax.xml.transform.Source;
import java.util.List;
import java.util.Map;

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
    public void test01() {
        Student student = new Student("张三",23,93.5);
        System.out.println("插入前：Student = " + student);
        dao.insertStudent(student);
        System.out.println("插入后：Student = " + student);
    }

    @Test
    public void test02() {
        Student student = new Student("张三",23,93.5);
        System.out.println("插入前：Student = " + student);
        dao.insertStudentCacheId(student);
        System.out.println("插入后：Student = " + student);
    }

    @Test
    public void test03() {
        dao.deleteStudent(26);
    }

    @Test
    public void test04() {
        Student student = new Student("张三",23,93.5);
        student.setId(28);
        dao.updateStudent(student);
    }

    @Test
    public void test05() {
        List<Student> students = dao.selectAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void test06() {
        Map<String, Object> map = dao.selectAllStudentsMap();
        System.out.println(map.get("张三"));
    }

    @Test
    public void test07() {
        Student student = dao.selectStudentById(25);
        System.out.println(student);
    }

    @Test
    public void test08() {
        List<Student> students = dao.selectStudentByName("张");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
