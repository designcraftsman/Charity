package com.emsi.charity.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class ActionCharite {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;

    @Column(length = 1000)
    private String description;

    private LocalDate date;
    private String lieu;
    private String categorie;
    private Double objectifMontant;
    private Double montantActuel = 0.0;

    @ManyToOne
    private Organisation organisation;

    @OneToMany(mappedBy = "action")
    private List<Media> medias;

    @OneToMany(mappedBy = "action")
    private List<Don> dons;

    @OneToMany(mappedBy = "action")
    private List<Participation> participations;

    public Long getId() {
        return id;
    }

    public List<Participation> getParticipations() {
        return participations;
    }

    public List<Don> getDons() {
        return dons;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public Double getMontantActuel() {
        return montantActuel;
    }

    public Double getObjectifMontant() {
        return objectifMontant;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getLieu() {
        return lieu;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getTitre() {
        return titre;
    }

    // Getters/setters
}
