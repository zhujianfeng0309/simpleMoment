package com.webpackge.controller;

/**
 * Created by ZHUJIANFENG on 2019/11/19.
 */

public class People {
    private String name;
    private Integer age;
public People(String name, Integer age){
    this.name = name;
    this.age = age;

}
   public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




}
