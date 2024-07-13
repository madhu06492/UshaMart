package com.example.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="order")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Order {
    @Id
    @GeneratedValue
    @Column(name="orderId")
    private long id;
    @Column(name="orderDate")
    private Date date;
    @Column(name="orderAmount")
    private Double amount;
    @Column(name="orderIsPaid")
    private boolean isPaid;
    @Column(name="orderProducts")
    private List<Product> products;
    @Column(name="orderUser")

    //change String to User data type
    private String user;
    //Change to  String to Address data type
    @Column(name="orderAddress")
    private String address;









}
