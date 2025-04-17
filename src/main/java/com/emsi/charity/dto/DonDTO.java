package com.emsi.charity.dto;

import java.time.LocalDate;

public class DonDTO {
    private Long id;
    private String utilisateurNom;
    private String actionTitre;
    private Double montant;
    private LocalDate dateDon;
    private String methodePaiement;

    // Constructeurs
    public DonDTO() {}

    public DonDTO(Long id, String utilisateurNom, String actionTitre, Double montant,
                  LocalDate dateDon, String methodePaiement) {
        this.id = id;
        this.utilisateurNom = utilisateurNom;
        this.actionTitre = actionTitre;
        this.montant = montant;
        this.dateDon = dateDon;
        this.methodePaiement = methodePaiement;
    }

    // Getters/setters
}
