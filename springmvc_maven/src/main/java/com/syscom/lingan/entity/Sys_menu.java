package com.syscom.lingan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sys_menu {
    private String menuId;
    private String menuName;
    private String pMenuId;
    private int seqNo;
    private String icon;
    private String path;
    private Date createTime;
    private String  updater;
    private Date updateTime;
}
