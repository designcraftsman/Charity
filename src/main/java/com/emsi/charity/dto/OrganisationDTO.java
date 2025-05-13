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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getLogo() { return logo; }
    public void setLogo(String logo) { this.logo = logo; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isEstApprouvee() { return estApprouvee; }
    public void setEstApprouvee(boolean estApprouvee) { this.estApprouvee = estApprouvee; }


    // Getters/setters
}
