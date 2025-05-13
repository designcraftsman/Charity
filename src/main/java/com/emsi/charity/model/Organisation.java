package com.emsi.charity.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Organisation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String adresseLegale;
    private String numeroFiscal;
    private String contactPrincipal;

    @Column(length = 1000)
    private String description;

    private String logo;
    private boolean estApprouvee;

    @OneToMany(mappedBy = "organisation")
    private List<ActionCharite> actions;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresseLegale() {
        return adresseLegale;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getContactPrincipal() {
        return contactPrincipal;
    }

    public String getDescription() {
        return description;
    }

    public String getLogo() {
        return logo;
    }

    public boolean isEstApprouvee() {
        return estApprouvee;
    }

    public List<ActionCharite> getActions() {
        return actions;
    }
    public void setId(Long id) { this.id = id; }

    public void setNom(String nom) { this.nom = nom; }

    public void setAdresseLegale(String adresseLegale) { this.adresseLegale = adresseLegale; }

    public void setNumeroFiscal(String numeroFiscal) { this.numeroFiscal = numeroFiscal; }

    public void setContactPrincipal(String contactPrincipal) { this.contactPrincipal = contactPrincipal; }

    public void setDescription(String description) { this.description = description; }

    public void setLogo(String logo) { this.logo = logo; }

    public void setEstApprouvee(boolean estApprouvee) { this.estApprouvee = estApprouvee; }

    public void setActions(List<ActionCharite> actions) { this.actions = actions; }

    // Getters/setters
}
