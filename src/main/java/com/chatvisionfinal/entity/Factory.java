package com.chatvisionfinal.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "factory")
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private boolean isEnabled;
    private String monthlyCapacity;
    @Column(unique=true)
    private String factory_code;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name ="factory_type",
            joinColumns = @JoinColumn(name = "factory_id"),
            inverseJoinColumns = @JoinColumn(name = "type_id"))
    private Set<FactoryTypes> factoryType = new HashSet<>();
    public Factory(){

    }

    public Factory(Long id, String name, String location, boolean isEnabled, String monthlyCapacity, String factory_code, Set<FactoryTypes> factoryType) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.isEnabled = isEnabled;
        this.monthlyCapacity = monthlyCapacity;
        this.factory_code = factory_code;
        this.factoryType = factoryType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getMonthlyCapacity() {
        return monthlyCapacity;
    }

    public void setMonthlyCapacity(String monthlyCapacity) {
        this.monthlyCapacity = monthlyCapacity;
    }

    public String getFactory_code() {
        return factory_code;
    }

    public void setFactory_code(String factory_code) {
        this.factory_code = factory_code;
    }

    public Set<FactoryTypes> getFactoryType() {
        return factoryType;
    }

    public void setFactoryType(Set<FactoryTypes> factoryType) {
        this.factoryType = factoryType;
    }
}
