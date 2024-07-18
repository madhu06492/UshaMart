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
@Table(name = "orderProduct")
public class OrderProduct implements Serializable {
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
