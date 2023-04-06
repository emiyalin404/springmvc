package com.syscom.lingan.entity;

import java.io.Serializable;

public class Role implements Serializable {
    private String type;
    private String rolename;

    public Role(){
    }

    public Role(String type, String rolename) {
        this.type = type;
        this.rolename = rolename;
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

    @Override
    public String toString() {
        return "Role{" +
                "type='" + type + '\'' +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
