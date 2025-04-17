package com.emsi.charity.model;

import jakarta.persistence.*;
import java.time.LocalDate;



@Entity
public class Participation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private ActionCharite action;

    private LocalDate dateParticipation;

    public Long getId() {
        return id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public ActionCharite getAction() {
        return action;
    }

    public LocalDate getDateParticipation() {
        return dateParticipation;
    }

    // Getters/setters
}
