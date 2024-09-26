package com.chatvisionfinal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long client_id;
    @JsonIgnore
    @ManyToOne(targetEntity = Client.class)
    @JoinColumn(name = "client_id", nullable = false, updatable = false, insertable = false)
    private Client client;
    public Brand(){

    }

    public Brand(Long id, String name, Long client_id, Client client) {
        this.id = id;
        this.name = name;
        this.client_id = client_id;
        this.client = client;
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

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
