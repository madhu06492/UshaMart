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
public class OrderProduct {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "orderId")
    private long orderId;
    @Column(name = "productId")
    private long productId;
    @Column(name = "quantity")
    private int quantity;
}
