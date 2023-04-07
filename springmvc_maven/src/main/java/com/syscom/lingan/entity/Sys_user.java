package com.syscom.lingan.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Sys_user implements Serializable {

    private String USER_ID;
    private String USER_NAME;
    private String PASSWORD;
    private Boolean IS_VALID;
    private String CREATOR;
    private LocalDateTime CREATE_TIME;
    private String UPDATER;
    private LocalDateTime UPDATE_TIME;
    public Sys_user(){
    }

    public Sys_user(String USER_ID, String USER_NAME, String PASSWORD, Boolean IS_VALID, String CREATOR, LocalDateTime CREATE_TIME, String UPDATER, LocalDateTime UPDATE_TIME) {
        this.USER_ID = USER_ID;
        this.USER_NAME = USER_NAME;
        this.PASSWORD = PASSWORD;
        this.IS_VALID = IS_VALID;
        this.CREATOR = CREATOR;
        this.CREATE_TIME = CREATE_TIME;
        this.UPDATER = UPDATER;
        this.UPDATE_TIME = UPDATE_TIME;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public Boolean getIS_VALID() {
        return IS_VALID;
    }

    public void setIS_VALID(Boolean IS_VALID) {
        this.IS_VALID = IS_VALID;
    }

    public String getCREATOR() {
        return CREATOR;
    }

    public void setCREATOR(String CREATOR) {
        this.CREATOR = CREATOR;
    }

    public LocalDateTime getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(LocalDateTime CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public String getUPDATER() {
        return UPDATER;
    }

    public void setUPDATER(String UPDATER) {
        this.UPDATER = UPDATER;
    }

    public LocalDateTime getUPDATE_TIME() {
        return UPDATE_TIME;
    }

    public void setUPDATE_TIME(LocalDateTime UPDATE_TIME) {
        this.UPDATE_TIME = UPDATE_TIME;
    }

    @Override
    public String toString() {
        return "Sys_user{" +
                "USER_ID='" + USER_ID + '\'' +
                ", USER_NAME='" + USER_NAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", IS_VALID=" + IS_VALID +
                ", CREATOR='" + CREATOR + '\'' +
                ", CREATE_TIME=" + CREATE_TIME +
                ", UPDATER='" + UPDATER + '\'' +
                ", UPDATE_TIME=" + UPDATE_TIME +
                '}';
    }
}
