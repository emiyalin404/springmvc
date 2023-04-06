package com.syscom.lingan.To;

import com.syscom.lingan.entity.User;

import java.io.Serializable;
import java.util.List;

public class RoleTo implements Serializable {
    private String type;
    private String rolename;

    private List<User> userList;
    public RoleTo(){
    };

    public RoleTo(String type, String rolename, List<User> userList) {
        this.type = type;
        this.rolename = rolename;
        this.userList = userList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "RoleTo{" +
                "type='" + type + '\'' +
                ", rolename='" + rolename + '\'' +
                ", userList=" + userList +
                '}';
    }
}
