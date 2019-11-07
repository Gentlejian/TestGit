package com.bjpowernode.dao;

import com.bjpowernode.beans.Student;
import com.bjpowernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 张剑锋
 * @date 2019/6/11 - 22:11
 */
public class StudentDaoImpl implements IStudentDao {

    private SqlSession sqlSession;

    @Override
    public void insertStu(Student student) {

        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.insert("insertStudent",student);
            sqlSession.commit();
        } finally {
            //sqlsession 不需要事物回滚
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}