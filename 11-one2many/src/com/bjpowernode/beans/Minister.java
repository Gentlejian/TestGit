package com.bjpowernode.beans;

/**
 * @author 张剑锋
 * @date 2019/6/19 - 18:57
 *
 * 部长
 */
public class Minister {
    private Integer mid;
    private String mname;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "Minister{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                '}';
    }
}
