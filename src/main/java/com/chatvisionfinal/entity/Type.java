package com.chatvisionfinal.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EClientType name;
}
