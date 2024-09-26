package com.chatvisionfinal.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "factory_types")
public class FactoryTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private EFactoryType type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EFactoryType getType() {
        return type;
    }

    public void setType(EFactoryType type) {
        this.type = type;
    }
}
