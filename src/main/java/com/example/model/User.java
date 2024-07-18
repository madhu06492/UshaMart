package com.example.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="users")
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
    @Column(name = "imagee")
    private String image;


}
