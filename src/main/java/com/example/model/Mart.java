package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Mart {
    @Id
    @GeneratedValue
    @Column(name ="id")
    private int id;
    @Column(name ="name")
    private String name;
    @Column(name ="address")
    private Address address;
    @Column(name ="phoneNumber")
    private String phoneNumber;
    @Column(name ="closeTime")
    private String closeTime;
    @Column(name ="openTime")
    private String openTime;
    @Column(name ="isOpen")
    private boolean isOpen;

}
