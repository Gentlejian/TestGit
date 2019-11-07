package com.bjpowernode.dao;

import com.bjpowernode.beans.Country;

/**
 * @author 张剑锋
 * @date 2019/6/19 - 19:04
 */
public interface ICountryDao {

    Country selectCountryById(int cid);
}
