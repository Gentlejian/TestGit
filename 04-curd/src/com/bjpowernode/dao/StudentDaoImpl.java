package com.bjpowernode.dao;

import com.bjpowernode.beans.Student;
import com.bjpowernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author 张剑锋
 * @date 2019/6/11 - 22:11
 */
public class StudentDaoImpl implements IStudentDao {

    private SqlSession sqlSession;

    @Override
    public void insertStudent(Student student) {

        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.insert("insertStudent",student);
            sqlSession.commit();
        } finally {
            //sqlsession 不需要事物回滚
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public void insertStudentCacheId(Student student) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.insert("insertStudentCacheId",student);
            sqlSession.commit();
        } finally {
            //sqlsession 不需要事物回滚
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public void deleteStudent(int id) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.delete("deleteStudent",id);
            sqlSession.commit();
        } finally {
            //sqlsession 不需要事物回滚
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public void updateStudent(Student student) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.update("updateStudent",student);
            sqlSession.commit();
        } finally {
            //sqlsession 不需要事物回滚
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public List<Student> selectAllStudent() {
        List<Student> students = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            students = sqlSession.selectList("selectAllStudent");
        } finally {
            //sqlsession 不需要事物回滚
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
        return students;
    }

    @Override
    public Map<String, Object> selectAllStudentsMap() {
        Map<String, Object> map = new HashMap<>();
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            map = sqlSession.selectMap("selectAllStudent","name");
        } finally {
            //sqlsession 不需要事物回滚
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
        return map;
    }

    @Override
    public Student selectStudentById(int id) {
        Student student = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            student = sqlSession.selectOne("selectStudentById",id);
        } finally {
            //sqlsession 不需要事物回滚
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
        return student;
    }

    @Override
    public List<Student> selectStudentByName(String name) {
        List<Student> students = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            students = sqlSession.selectList("selectStudentByName",name);
        } finally {
            //sqlsession 不需要事物回滚
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
        return students;
    }
}
