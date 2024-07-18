package com.example.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
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
    @Column(name = "image")
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
                ", address=" + address +
                ", points=" + points +
                ", credit=" + credit +
                ", order=" + order +
                ", image='" + image + '\'' +
                '}';
    }
}
