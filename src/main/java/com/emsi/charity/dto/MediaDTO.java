package com.emsi.charity.dto;
public class MediaDTO {
    private Long id;
    private String type;
    private String url;

    // Constructeurs
    public MediaDTO() {}

    public MediaDTO(Long id, String type, String url) {
        this.id = id;
        this.type = type;
        this.url = url;
    }

    // Getters/setters
}
