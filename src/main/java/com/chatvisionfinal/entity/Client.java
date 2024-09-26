package com.chatvisionfinal.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String country;
    private String type;
    @Column(name = "client_code")
    private String clientCode;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name ="client_type",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "type_id"))
    private Set<Type> client_type = new HashSet<>();
    public Client(){

    }

    public Client(Long id, String name, String address, String country, String type, String clientCode, Set<Type> client_type) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.country = country;
        this.type = type;
        this.clientCode = clientCode;
        this.client_type = client_type;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public Set<Type> getClient_type() {
        return client_type;
    }

    public void setClient_type(Set<Type> client_type) {
        this.client_type = client_type;
    }
}
