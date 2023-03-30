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
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String ITEM_NO;
    private String ITEM_NAME;
    private Long PRICE;
    private LocalDateTime EFF_DATE_FROM;
    private LocalDateTime EFF_DATE_TO;
    private String TAX;
    private String CREATOR;
    private LocalDateTime CREATER_TIME;
    private String UPDATER;
    private LocalDateTime UPDATE_TIME;
}
