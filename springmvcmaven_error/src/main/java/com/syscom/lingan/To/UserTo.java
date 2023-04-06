package com.syscom.lingan.To;

import com.syscom.lingan.entity.Role;

import java.io.Serializable;

public class UserTo implements Serializable {

    private int id;
    private String name;
    private int age;
    private String sex;
    private String role;
    private Role roleDetail;
    public UserTo(){
    }

    public UserTo(int id, String name, int age, String sex, String role, Role roleDetail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.role = role;
        this.roleDetail = roleDetail;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Role getRoleDetail() {
        return roleDetail;
    }

    public void setRoleDetail(Role roleDetail) {
        this.roleDetail = roleDetail;
    }

    @Override
    public String toString() {
        return "UserTo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", role='" + role + '\'' +
                ", roleDetail=" + roleDetail +
                '}';
    }
}
