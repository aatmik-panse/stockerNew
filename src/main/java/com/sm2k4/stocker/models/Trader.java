package com.sm2k4.stocker.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "trader")
public class Trader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String contact;
    @Column(nullable = false,updatable = false)
    private Long licno;
    @OneToMany
    private List<Transaction> transList;
}