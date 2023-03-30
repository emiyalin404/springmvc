package net.javaguides.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="sys_menu")
public class Sys_Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private String MENU_ID;
private String MENU_NAME;
private String P_MENU_ID;
private int SEQ_NO;
private String ICON;
private String PATH;
private String CREATOR;
private LocalDateTime CREATE_TIME;
private String UPDATER;
private LocalDateTime UPDATE_TIME;

}
