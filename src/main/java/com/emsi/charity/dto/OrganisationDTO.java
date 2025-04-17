package com.emsi.charity.dto;

public class OrganisationDTO {
    private Long id;
    private String nom;
    private String logo;
    private String description;
    private boolean estApprouvee;

    // Constructeurs
    public OrganisationDTO() {}
    public OrganisationDTO(Long id, String nom, String logo, String description, boolean estApprouvee) {
        this.id = id;
        this.nom = nom;
        this.logo = logo;
        this.description = description;
        this.estApprouvee = estApprouvee;
    }

    // Getters/setters
}
