package com.emsi.charity.service;

import com.emsi.charity.dto.UtilisateurDTO;
import com.emsi.charity.model.Utilisateur;
import com.emsi.charity.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepo;

    public UtilisateurService(UtilisateurRepository utilisateurRepo) {
        this.utilisateurRepo = utilisateurRepo;
    }

    public Optional<UtilisateurDTO> getUtilisateurById(Long id) {
        return utilisateurRepo.findById(id)
                .map(u -> new UtilisateurDTO(u.getId(), u.getNom(), u.getEmail()));
    }
}
