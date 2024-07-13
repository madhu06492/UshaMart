package com.example.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "productId")
    private long id;
    @Column(name = "productName")
    private String name;
    @Column(name = "productMrp")
    private double mrp;
    @Column(name = "productSaleRate")
    private double saleRate;
    @Column(name = "productDiscount")
    private double discount;
    @Column(name = "productQuantity")
    private String quantity;
    @Column(name = "productDescription")
    private String description;
    @Column(name = "productImage")
    private List<String> images;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mrp=" + mrp +
                ", saleRate=" + saleRate +
                ", discount=" + discount +
                ", quantity='" + quantity + '\'' +
                ", description='" + description + '\'' +
                ", images=" + images +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMrp() {
        return mrp;
    }

    public long getId() {
        return id;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public double getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(double saleRate) {
        this.saleRate = saleRate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Product(long id, String name, double mrp, double saleRate, double discount, String quantity, String description, List<String> images) {
        this.id = id;
        this.name = name;
        this.mrp = mrp;
        this.saleRate = saleRate;
        this.discount = discount;
        this.quantity = quantity;
        this.description = description;
        this.images = images;
    }


}
