package com.syscom.lingan.To;

import com.syscom.lingan.entity.Product;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class Base_paramTo implements Serializable {
    private String TITLE;
    private String TAG;
    private int SEQ_NO;
    private String CONTENT;
    private String CONTENT_ZH_CN;
    private String CONTENT_ZH_TW;
    private String CONTENT_EN_US;
    private String LANGUAGE;
    private String NOTES;
    private String STATUS;
    private String CREATOR;
    private LocalDateTime CREATE_TIME;
    private String UPDATER;
    private LocalDateTime UPDATE_TIME;

    private List<Product> productList;
    public Base_paramTo(){
    };

    public Base_paramTo(String TITLE, String TAG, int SEQ_NO, String CONTENT, String CONTENT_ZH_CN, String CONTENT_ZH_TW, String CONTENT_EN_US, String LANGUAGE, String NOTES, String STATUS, String CREATOR, LocalDateTime CREATE_TIME, String UPDATER, LocalDateTime UPDATE_TIME, List<Product> productList) {
        this.TITLE = TITLE;
        this.TAG = TAG;
        this.SEQ_NO = SEQ_NO;
        this.CONTENT = CONTENT;
        this.CONTENT_ZH_CN = CONTENT_ZH_CN;
        this.CONTENT_ZH_TW = CONTENT_ZH_TW;
        this.CONTENT_EN_US = CONTENT_EN_US;
        this.LANGUAGE = LANGUAGE;
        this.NOTES = NOTES;
        this.STATUS = STATUS;
        this.CREATOR = CREATOR;
        this.CREATE_TIME = CREATE_TIME;
        this.UPDATER = UPDATER;
        this.UPDATE_TIME = UPDATE_TIME;
        this.productList = productList;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    public int getSEQ_NO() {
        return SEQ_NO;
    }

    public void setSEQ_NO(int SEQ_NO) {
        this.SEQ_NO = SEQ_NO;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
    }

    public String getCONTENT_ZH_CN() {
        return CONTENT_ZH_CN;
    }

    public void setCONTENT_ZH_CN(String CONTENT_ZH_CN) {
        this.CONTENT_ZH_CN = CONTENT_ZH_CN;
    }

    public String getCONTENT_ZH_TW() {
        return CONTENT_ZH_TW;
    }

    public void setCONTENT_ZH_TW(String CONTENT_ZH_TW) {
        this.CONTENT_ZH_TW = CONTENT_ZH_TW;
    }

    public String getCONTENT_EN_US() {
        return CONTENT_EN_US;
    }

    public void setCONTENT_EN_US(String CONTENT_EN_US) {
        this.CONTENT_EN_US = CONTENT_EN_US;
    }

    public String getLANGUAGE() {
        return LANGUAGE;
    }

    public void setLANGUAGE(String LANGUAGE) {
        this.LANGUAGE = LANGUAGE;
    }

    public String getNOTES() {
        return NOTES;
    }

    public void setNOTES(String NOTES) {
        this.NOTES = NOTES;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Base_paramTo{" +
                "TITLE='" + TITLE + '\'' +
                ", TAG='" + TAG + '\'' +
                ", SEQ_NO=" + SEQ_NO +
                ", CONTENT='" + CONTENT + '\'' +
                ", CONTENT_ZH_CN='" + CONTENT_ZH_CN + '\'' +
                ", CONTENT_ZH_TW='" + CONTENT_ZH_TW + '\'' +
                ", CONTENT_EN_US='" + CONTENT_EN_US + '\'' +
                ", LANGUAGE='" + LANGUAGE + '\'' +
                ", NOTES='" + NOTES + '\'' +
                ", STATUS='" + STATUS + '\'' +
                ", CREATOR='" + CREATOR + '\'' +
                ", CREATE_TIME=" + CREATE_TIME +
                ", UPDATER='" + UPDATER + '\'' +
                ", UPDATE_TIME=" + UPDATE_TIME +
                ", productList=" + productList +
                '}';
    }
}
