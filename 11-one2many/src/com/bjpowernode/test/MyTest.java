package com.bjpowernode.test;

import com.bjpowernode.beans.Country;
import com.bjpowernode.dao.ICountryDao;
import com.bjpowernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;


/**
 * @author 张剑锋
 * @date 2019/6/11 - 22:02
 */
public class MyTest {

    private ICountryDao dao;
    private SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(ICountryDao.class);
    }


    @Test
    public void test01() {
        Country country = dao.selectCountryById(1);
        System.out.println(country);
    }
}
