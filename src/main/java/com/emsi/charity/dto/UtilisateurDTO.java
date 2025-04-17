package com.emsi.charity.dto;

public class UtilisateurDTO {
    private Long id;
    private String nom;
    private String email;

    // Constructeurs
    public UtilisateurDTO() {}
    public UtilisateurDTO(Long id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    // Getters/setters
}
