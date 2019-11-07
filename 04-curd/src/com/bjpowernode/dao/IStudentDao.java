package com.bjpowernode.dao;

import com.bjpowernode.beans.Student;

import java.util.List;
import java.util.Map;

/**
 * @author 张剑锋
 * @date 2019/6/11 - 20:32
 */
public interface IStudentDao {

    void insertStudent(Student student);//增
    void insertStudentCacheId(Student student);//增(可以获取到id)


    void deleteStudent(int id);//删
    void updateStudent(Student student);//改

    List<Student> selectAllStudent();//查询所有
    Map<String, Object> selectAllStudentsMap();//以map集合的形式查询<了解>

    Student selectStudentById(int id);//根据id查询
    List<Student> selectStudentByName(String name);//模糊查询


}
