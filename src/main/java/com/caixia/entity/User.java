package com.caixia.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-19
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class User implements Serializable{

    private int id;

    private String name;

    private String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
