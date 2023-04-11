package com.syscom.lingan.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class Sys_user implements Serializable {

    @JsonProperty("USER_ID")
    private String userId;
    @JsonProperty("USER_NAME")
    private String userName;
    @JsonProperty("PASSWORD")
    private String passWord;
    @JsonProperty("IS_VALID")
    private Boolean isValid;
    @JsonProperty("CREATOR")
    private String creaTor;
    @JsonProperty("CREATE_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date  createTime;
    @JsonProperty("UPDATER")
    private String upDater;
    @JsonProperty("UPDATE_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date upDateTime;
    public Sys_user(){
    }

    public Sys_user(String userId, String userName, String passWord, Boolean isValid, String creaTor, Date createTime, String upDater, Date upDateTime) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
        this.isValid = isValid;
        this.creaTor = creaTor;
        this.createTime = createTime;
        this.upDater = upDater;
        this.upDateTime = upDateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    public String getCreaTor() {
        return creaTor;
    }

    public void setCreaTor(String creaTor) {
        this.creaTor = creaTor;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpDater() {
        return upDater;
    }

    public void setUpDater(String upDater) {
        this.upDater = upDater;
    }

    public Date getUpDateTime() {
        return upDateTime;
    }

    public void setUpDateTime(Date upDateTime) {
        this.upDateTime = upDateTime;
    }

    @Override
    public String toString() {
        return "Sys_user{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", isValid=" + isValid +
                ", creaTor='" + creaTor + '\'' +
                ", createTime=" + createTime +
                ", upDater='" + upDater + '\'' +
                ", upDateTime=" + upDateTime +
                '}';
    }
}
