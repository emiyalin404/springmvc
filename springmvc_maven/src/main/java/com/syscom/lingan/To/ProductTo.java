package com.syscom.lingan.To;

import com.syscom.lingan.entity.Base_param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductTo implements Serializable {
    private String ITEM_NO;
    private String ITEM_NAME;
    private BigDecimal PRICE;
    private LocalDate EFF_DATE_FROM;
    private LocalDate EFF_DATE_TO;
    private String TAX;
    private String CREATOR;
    private LocalDateTime CREATE_TIME;
    private String UPDATER;
    private LocalDateTime UPDATE_TIME;
    private LocalDateTime creater_time;

    private Base_param base_paramDetail;

    public ProductTo(){
    }

    public ProductTo(String ITEM_NO, String ITEM_NAME, BigDecimal PRICE, LocalDate EFF_DATE_FROM, LocalDate EFF_DATE_TO, String TAX, String CREATOR, LocalDateTime CREATE_TIME, String UPDATER, LocalDateTime UPDATE_TIME, LocalDateTime creater_time, Base_param base_paramDetail) {
        this.ITEM_NO = ITEM_NO;
        this.ITEM_NAME = ITEM_NAME;
        this.PRICE = PRICE;
        this.EFF_DATE_FROM = EFF_DATE_FROM;
        this.EFF_DATE_TO = EFF_DATE_TO;
        this.TAX = TAX;
        this.CREATOR = CREATOR;
        this.CREATE_TIME = CREATE_TIME;
        this.UPDATER = UPDATER;
        this.UPDATE_TIME = UPDATE_TIME;
        this.creater_time = creater_time;
        this.base_paramDetail = base_paramDetail;
    }

    public String getITEM_NO() {
        return ITEM_NO;
    }

    public void setITEM_NO(String ITEM_NO) {
        this.ITEM_NO = ITEM_NO;
    }

    public String getITEM_NAME() {
        return ITEM_NAME;
    }

    public void setITEM_NAME(String ITEM_NAME) {
        this.ITEM_NAME = ITEM_NAME;
    }

    public BigDecimal getPRICE() {
        return PRICE;
    }

    public void setPRICE(BigDecimal PRICE) {
        this.PRICE = PRICE;
    }

    public LocalDate getEFF_DATE_FROM() {
        return EFF_DATE_FROM;
    }

    public void setEFF_DATE_FROM(LocalDate EFF_DATE_FROM) {
        this.EFF_DATE_FROM = EFF_DATE_FROM;
    }

    public LocalDate getEFF_DATE_TO() {
        return EFF_DATE_TO;
    }

    public void setEFF_DATE_TO(LocalDate EFF_DATE_TO) {
        this.EFF_DATE_TO = EFF_DATE_TO;
    }

    public String getTAX() {
        return TAX;
    }

    public void setTAX(String TAX) {
        this.TAX = TAX;
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

    public LocalDateTime getCreater_time() {
        return creater_time;
    }

    public void setCreater_time(LocalDateTime creater_time) {
        this.creater_time = creater_time;
    }

    public Base_param getBase_paramDetail() {
        return base_paramDetail;
    }

    public void setBase_paramDetail(Base_param base_paramDetail) {
        this.base_paramDetail = base_paramDetail;
    }

    @Override
    public String toString() {
        return "ProductTo{" +
                "ITEM_NO='" + ITEM_NO + '\'' +
                ", ITEM_NAME='" + ITEM_NAME + '\'' +
                ", PRICE=" + PRICE +
                ", EFF_DATE_FROM=" + EFF_DATE_FROM +
                ", EFF_DATE_TO=" + EFF_DATE_TO +
                ", TAX='" + TAX + '\'' +
                ", CREATOR='" + CREATOR + '\'' +
                ", CREATE_TIME=" + CREATE_TIME +
                ", UPDATER='" + UPDATER + '\'' +
                ", UPDATE_TIME=" + UPDATE_TIME +
                ", creater_time=" + creater_time +
                ", base_paramDetail=" + base_paramDetail +
                '}';
    }
}
