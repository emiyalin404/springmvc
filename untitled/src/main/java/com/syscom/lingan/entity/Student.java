package com.syscom.lingan.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    //序列化完的日期格式
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //序列化完的日期格式(不補0)
    private Date creatTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date update;

    public Student(){
    }
    public Student(int id, String name, int age, String email, String creatTime, String update) throws ParseException {
        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 =new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.creatTime =format.parse(creatTime);
        this.update =format2.parse(update);
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", creatTime=" +creatTime  +
                ", update=" + update +
                '}';
    }
}
