package com.emsi.charity.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @Column(unique = true)
    private String email;

    private String motDePasse;

    // Relations
    @OneToMany(mappedBy = "utilisateur")
    private List<Don> dons;

    @OneToMany(mappedBy = "utilisateur")
    private List<Participation> participations;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public List<Don> getDons() {
        return dons;
    }

    public List<Participation> getParticipations() {
        return participations;
    }

    // Getters/setters
}
