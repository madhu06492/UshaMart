package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue
    @Column(name = "")
    private long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "address")
    public Address address;
    @Column(name = "points")
    private int points;
    @Column(name = "credit")
    private double credit;
    @Column(name = "order")
    private long order;
    @Column(name = "imagee")
    private String image;

    public User(long id, String firstName, String lastName, String phoneNumber, Address addsess, int points, double credit, long order, String image) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = addsess;
        this.points = points;
        this.credit = credit;
        this.order = order;
        this.image = image;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", addsess=" + address +
                ", points=" + points +
                ", credit=" + credit +
                ", order=" + order +
                ", image='" + image + '\'' +
                '}';
    }
}
