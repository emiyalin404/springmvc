package com.syscom.lingan.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Date;

public class Base_param {
    @JsonProperty("TITLE")
    private String tiTle;
    @JsonProperty("TAG")
    private String tag;
    @JsonProperty("SEQ_NO")
    private int seqNo;
    @JsonProperty("CONTENT")
    private String conTent;
    @JsonProperty("CONTENT_ZH_CN")
    private String conTentZhCh;
    @JsonProperty("CONTENT_ZH_TW")
    private String conTentZhTw;
    @JsonProperty("CONTENT_EN_US")
    private String conTentEnUs;
    @JsonProperty("LANGUAGE")
    private String lanGuage;
    @JsonProperty("NOTES")
    private String noTes;
    @JsonProperty("STATUS")
    private String staTus;
    @JsonProperty("CREATOR")
    private String creaTor;
    @JsonProperty("CREATE_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JsonProperty("UPDATER")
    private String upDater;
    @JsonProperty("UPDATE_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date upDateTime;


    public Base_param(){
    }

    public Base_param(String tiTle, String tag, int seqNo, String conTent, String conTentZhCh, String conTentZhTw, String conTentEnUs, String lanGuage, String noTes, String staTus, String creaTor, Date createTime, String upDater, Date upDateTime) {
        this.tiTle = tiTle;
        this.tag = tag;
        this.seqNo = seqNo;
        this.conTent = conTent;
        this.conTentZhCh = conTentZhCh;
        this.conTentZhTw = conTentZhTw;
        this.conTentEnUs = conTentEnUs;
        this.lanGuage = lanGuage;
        this.noTes = noTes;
        this.staTus = staTus;
        this.creaTor = creaTor;
        this.createTime = createTime;
        this.upDater = upDater;
        this.upDateTime = upDateTime;
    }

    public String getTiTle() {
        return tiTle;
    }

    public void setTiTle(String tiTle) {
        this.tiTle = tiTle;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    public String getConTent() {
        return conTent;
    }

    public void setConTent(String conTent) {
        this.conTent = conTent;
    }

    public String getConTentZhCh() {
        return conTentZhCh;
    }

    public void setConTentZhCh(String conTentZhCh) {
        this.conTentZhCh = conTentZhCh;
    }

    public String getConTentZhTw() {
        return conTentZhTw;
    }

    public void setConTentZhTw(String conTentZhTw) {
        this.conTentZhTw = conTentZhTw;
    }

    public String getConTentEnUs() {
        return conTentEnUs;
    }

    public void setConTentEnUs(String conTentEnUs) {
        this.conTentEnUs = conTentEnUs;
    }

    public String getLanGuage() {
        return lanGuage;
    }

    public void setLanGuage(String lanGuage) {
        this.lanGuage = lanGuage;
    }

    public String getNoTes() {
        return noTes;
    }

    public void setNoTes(String noTes) {
        this.noTes = noTes;
    }

    public String getStaTus() {
        return staTus;
    }

    public void setStaTus(String staTus) {
        this.staTus = staTus;
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
        return "Base_param{" +
                "tiTle='" + tiTle + '\'' +
                ", tag='" + tag + '\'' +
                ", seqNo=" + seqNo +
                ", conTent='" + conTent + '\'' +
                ", conTentZhCh='" + conTentZhCh + '\'' +
                ", conTentZhTw='" + conTentZhTw + '\'' +
                ", conTentEnUs='" + conTentEnUs + '\'' +
                ", lanGuage='" + lanGuage + '\'' +
                ", noTes='" + noTes + '\'' +
                ", staTus='" + staTus + '\'' +
                ", creaTor='" + creaTor + '\'' +
                ", createTime=" + createTime +
                ", upDater='" + upDater + '\'' +
                ", upDateTime=" + upDateTime +
                '}';
    }
}
