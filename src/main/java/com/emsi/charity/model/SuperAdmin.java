package com.emsi.charity.model;

import jakarta.persistence.*;

@Entity
public class SuperAdmin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String motDePasse;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    // Getters/setters
}
