package com.store.store.reflecttest;

/**
 * Created by Administrator on 2019/3/19.
 */
public class Student {
    private String name;
    private Long age;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student(String name, Long age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Student() {
    }
}
