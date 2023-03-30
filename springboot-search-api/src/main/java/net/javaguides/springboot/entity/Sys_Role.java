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
@Table(name="sys_role")
public class Sys_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private String ROLE_ID;
private String ROLE_NAME;
private String CREATOR;
private LocalDateTime CREATE_TIME;
private String UPDATER;
private LocalDateTime UPDATE_TIME;
}
