package com.example.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name="address")
public class Address implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "line1")
    private String line1;
    @Column(name = "line2")
    private String line2;
    @Column(name = "landmark")
    private String landMart;
    @Column(name = "town")
    private String town;
    @Column(name = "state")
    private String state;
    @Column(name = "pincode")
    private long pincode;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", landMart='" + landMart + '\'' +
                ", town='" + town + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLandMart() {
        return landMart;
    }

    public void setLandMart(String landMart) {
        this.landMart = landMart;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public Address(long id, String line1, String line2, String landMart, String town, String state, long pincode) {
        this.id = id;
        this.line1 = line1;
        this.line2 = line2;
        this.landMart = landMart;
        this.town = town;
        this.state = state;
        this.pincode = pincode;
    }
}
