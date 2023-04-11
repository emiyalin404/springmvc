package net.javaguides.springboot.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @JsonProperty("id")
    private int id;
    @JsonProperty("active")
    private boolean active;
    @JsonProperty("date_created")
    private Date dateCreated;
    @JsonProperty("date_updated")
    private Date dateUpdated;
    @JsonProperty("description")
    private String description;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("sku")
    private String sku;

    public Product(){};
    public Product(int id, boolean active, Date dateCreated, Date dateUpdated, String description, String imageUrl, String name, String sku) {
        this.id = id;
        this.active = active;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.description = description;
        this.imageUrl = imageUrl;
        this.name = name;
        this.sku = sku;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", active=" + active +
                ", dateCreated=" + dateCreated +
                ", dateUpdated=" + dateUpdated +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                '}';
    }
    //    private String ITEM_NO;
//    private String ITEM_NAME;
//    private Long PRICE;
//    private LocalDateTime EFF_DATE_FROM;
//    private LocalDateTime EFF_DATE_TO;
//    private String TAX;
//    private String CREATOR;
//    private LocalDateTime CREATER_TIME;
//    private String UPDATER;
//    private LocalDateTime UPDATE_TIME;
}
