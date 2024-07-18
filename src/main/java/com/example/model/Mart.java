package com.example.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name="mart")
public class Mart implements Serializable {
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
