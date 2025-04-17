package com.emsi.charity.dto;

import java.time.LocalDate;

public class ActionChariteDTO {
    private Long id;
    private String titre;
    private String description;
    private LocalDate date;
    private String lieu;
    private String categorie;
    private Double objectifMontant;
    private Double montantActuel;
    private String organisationNom;

    // Constructeurs
    public ActionChariteDTO() {}

    public ActionChariteDTO(Long id, String titre, String description, LocalDate date, String lieu,
                            String categorie, Double objectifMontant, Double montantActuel, String organisationNom) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.date = date;
        this.lieu = lieu;
        this.categorie = categorie;
        this.objectifMontant = objectifMontant;
        this.montantActuel = montantActuel;
        this.organisationNom = organisationNom;
    }

    // Getters/setters
}
