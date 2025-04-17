package com.emsi.charity.dto;

import java.time.LocalDate;

public class ParticipationDTO {
    private Long id;
    private String utilisateurNom;
    private String actionTitre;
    private LocalDate dateParticipation;

    // Constructeurs
    public ParticipationDTO() {}

    public ParticipationDTO(Long id, String utilisateurNom, String actionTitre, LocalDate dateParticipation) {
        this.id = id;
        this.utilisateurNom = utilisateurNom;
        this.actionTitre = actionTitre;
        this.dateParticipation = dateParticipation;
    }

    // Getters/setters
}
