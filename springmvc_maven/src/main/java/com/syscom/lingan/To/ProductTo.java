package com.syscom.lingan.To;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.syscom.lingan.entity.Base_param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class ProductTo implements Serializable {
//    @JsonProperty("ITEM_NO")
    private String itemNo;
//    @JsonProperty("ITEM_NAME")
    private String itemName;
//    @JsonProperty("PRICE")
    private BigDecimal price;

//    @JsonProperty("EFF_DATE_FROM")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date effDateFrom;
//    @JsonProperty("EFF_DATE_TO")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date effDateTo;
//    @JsonProperty("TAX")
    private String tax;
//    @JsonProperty("CREATOR")
    private String creaTor;
//    @JsonProperty("CREATE_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
//    @JsonProperty("UPDATER")
    private String upDater;
//    @JsonProperty("UPDATE_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date upDateTime;
//    @JsonProperty("creater_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creatertime;

    private Base_param base_paramDetail;

    public ProductTo(){
    }

    public ProductTo(String itemNo, String itemName, BigDecimal price, Date effDateFrom, Date effDateTo, String tax, String creaTor, Date createTime, String upDater, Date upDateTime, Date creatertime, Base_param base_paramDetail) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.price = price;
        this.effDateFrom = effDateFrom;
        this.effDateTo = effDateTo;
        this.tax = tax;
        this.creaTor = creaTor;
        this.createTime = createTime;
        this.upDater = upDater;
        this.upDateTime = upDateTime;
        this.creatertime = creatertime;
        this.base_paramDetail = base_paramDetail;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getEffDateFrom() {
        return effDateFrom;
    }

    public void setEffDateFrom(Date effDateFrom) {
        this.effDateFrom = effDateFrom;
    }

    public Date getEffDateTo() {
        return effDateTo;
    }

    public void setEffDateTo(Date effDateTo) {
        this.effDateTo = effDateTo;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
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

    public Date getCreatertime() {
        return creatertime;
    }

    public void setCreatertime(Date creatertime) {
        this.creatertime = creatertime;
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
                "itemNo='" + itemNo + '\'' +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", effDateFrom=" + effDateFrom +
                ", effDateTo=" + effDateTo +
                ", tax='" + tax + '\'' +
                ", creaTor='" + creaTor + '\'' +
                ", createTime=" + createTime +
                ", upDater='" + upDater + '\'' +
                ", upDateTime=" + upDateTime +
                ", creatertime=" + creatertime +
                ", base_paramDetail=" + base_paramDetail +
                '}';
    }
}
