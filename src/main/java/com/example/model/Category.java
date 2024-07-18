package com.example.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@EqualsAndHashCode
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "category")
public class Category implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
}
