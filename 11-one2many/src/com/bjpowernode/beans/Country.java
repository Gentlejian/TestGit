package com.bjpowernode.beans;

import java.util.Set;

/**
 * @author 张剑锋
 * @date 2019/6/19 - 18:57
 *
 * 国家
 */
public class Country {
    private Integer cid;
    private String cname;
    //关联属性
    private Set<Minister> ministers;//使用set是因为set无序不可重复

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set<Minister> getMinisters() {
        return ministers;
    }

    public void setMinisters(Set<Minister> ministers) {
        this.ministers = ministers;
    }

    @Override
    public String toString() {
        return "Country{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", ministers=" + ministers +
                '}';
    }
}
