package com.emsi.charity.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Don {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private ActionCharite action;

    private Double montant;
    private LocalDate dateDon;
    private String methodePaiement;

    public Long getId() {
        return id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public ActionCharite getAction() {
        return action;
    }

    public Double getMontant() {
        return montant;
    }

    public LocalDate getDateDon() {
        return dateDon;
    }

    public String getMethodePaiement() {
        return methodePaiement;
    }

    // Getters/setters
}
