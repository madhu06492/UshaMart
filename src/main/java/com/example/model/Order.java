package com.example.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "date")
    private Date date;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "isPaid")
    private boolean isPaid;
    @Column(name = "products")
    private List<Product> products;
    @Column(name = "user")
    //TODO :change String to User data type
    private String user;
    //TODO: Change   String to UserAddress data type
    @Column(name = "userAddress")
    private String userAddress;
    //TODO: change  string to orderAddress data type
    @Column(name = "martAddress")
    private String martAddress;
}
