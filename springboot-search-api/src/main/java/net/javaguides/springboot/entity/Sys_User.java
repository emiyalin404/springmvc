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
@Table(name="sys_user")
public class Sys_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String USER_ID;
    private String USER_NAME;
    private String PASSWORD;
    private String IS_VALID;
    private String CREATOR;
    private LocalDateTime CREATE_TIME;
    private String UPDATER;
    private LocalDateTime UPDATE_TIME;
}
