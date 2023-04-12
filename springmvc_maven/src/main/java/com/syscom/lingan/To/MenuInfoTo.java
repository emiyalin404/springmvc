package com.syscom.lingan.To;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuInfoTo implements Serializable {

    @JsonProperty("MENU_ID")
    private String MENU_ID;

    @JsonProperty("MENU_NAME")
    private String MENU_NAME;

    @JsonProperty("P_MENU_ID")
    private String P_MENU_ID;

    @JsonProperty("SEQ_NO")
    private String SEQ_NO;

    @JsonProperty("PAGE")
    private String PAGE;

    @JsonProperty("ICON")
    private String ICON;

    @JsonProperty("PATH")
    private String PATH;

    @JsonProperty("children")
    private List<Children> children;

    @JsonProperty("BREADCRUMB")
    private String BREADCRUMB;

    @JsonProperty("CREATOR")
    private String CREATOR;

    @JsonProperty("CREATE_TIME")
    private String CREATE_TIME;

    @JsonProperty("UPDATER")
    private String UPDATER;

    @JsonProperty("UPDATE_TIME")
    private String UPDATE_TIME;
}
