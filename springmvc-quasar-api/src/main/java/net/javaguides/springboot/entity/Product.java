package net.javaguides.springboot.entity;

// import java.time.LocalDateTime;

// import org.hibernate.annotations.CreationTimestamp;
// import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class Product {
    @Id
    @JsonProperty()
    private String ITEM_NO;
    private String ITEM_NAME;
//    private BigDecimal PRICE;
    private int PRICE;
    @Temporal(TemporalType.DATE)
    private LocalDate EFF_DATE_FROM;
    @Temporal(TemporalType.DATE)
    private LocalDate EFF_DATE_TO;
    private String TAX;
    private String CREATOR;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime CREATER_TIME;
    private String UPDATER;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime UPDATE_TIME;


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

    public int getPRICE() {
        return PRICE;
    }

    public void setPRICE(int PRICE) {
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

    public LocalDateTime getCREATER_TIME() {
        return CREATER_TIME;
    }

    public void setCREATER_TIME(LocalDateTime CREATER_TIME) {
        this.CREATER_TIME = CREATER_TIME;
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





}
