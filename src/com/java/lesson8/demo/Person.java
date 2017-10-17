package com.java.lesson8.com.java.lesson8.demo;

import java.util.Date;

public class Person {

    private String name;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date date) {
        this.birthday = date;
    }

    public String getDetail() {
        return this.name + this.birthday.toString();
    }
}
