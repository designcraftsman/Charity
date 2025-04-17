package com.emsi.charity.model;

import jakarta.persistence.*;

@Entity
public class Media {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String url;

    @ManyToOne
    private ActionCharite action;

    // Getters/setters
}
