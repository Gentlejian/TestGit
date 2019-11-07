package com.bjpowernode.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author 张剑锋
 * @date 2019/6/12 - 11:27
 */
public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {

        System.out.println("Git代码。。。。。");

        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            if(sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
                return sqlSessionFactory.openSession();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
