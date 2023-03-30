package net.javaguides.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="base_param")
public class Base_Param {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String TITLE;
    private String TAG;
    private int SEQ_NO;
    private String CONTENT;
    private String CONTENT_ZH_CN;
    private String CONTENT_ZH_TW;
    private String CONTENT_EN_US;
    private String LANGUAGE;
    private String NOTES;
    private String CREATOR;
    private LocalDateTime CREATE_TIME;
    private String UPDATER;
    private LocalDateTime UPDATE_TIME;

}
