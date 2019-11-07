package com.bjpowernode.beans;

/**
 * @author 张剑锋
 * @date 2019/6/11 - 20:06
 */
public class Student {

    /**
     * 定义成员变量（成员变量是私有的）
     */
    private Integer id;
    private String name;
    private int age;
    private double score;

    /**
     * 无参构造器如果不写，会默认加上一个无参构造方法
     * 提供类的初始化和实例化，以便调用。
     */
    public Student() {
    }

    public Student( String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    /**
     * get 或者 set 方法后首字母大写的叫属性（属性是公开的）
     * @return
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
