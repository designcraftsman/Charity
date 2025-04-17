package com.emsi.charity.service;

import com.emsi.charity.dto.ActionChariteDTO;
import com.emsi.charity.model.ActionCharite;
import com.emsi.charity.repository.ActionChariteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ActionChariteService {

    private final ActionChariteRepository actionRepo;

    public ActionChariteService(ActionChariteRepository actionRepo) {
        this.actionRepo = actionRepo;
    }

    public Page<ActionChariteDTO> getActionsParCategorie(String categorie, Pageable pageable) {
        return actionRepo.findByCategorie(categorie, pageable)
                .map(a -> new ActionChariteDTO(
                        a.getId(), a.getTitre(), a.getDescription(), a.getDate(), a.getLieu(),
                        a.getCategorie(), a.getObjectifMontant(), a.getMontantActuel(),
                        a.getOrganisation().getNom()));
    }

    public Page<ActionChariteDTO> chercherActions(String motCle, Pageable pageable) {
        return actionRepo.findByTitreContainingIgnoreCase(motCle, pageable)
                .map(a -> new ActionChariteDTO(
                        a.getId(), a.getTitre(), a.getDescription(), a.getDate(), a.getLieu(),
                        a.getCategorie(), a.getObjectifMontant(), a.getMontantActuel(),
                        a.getOrganisation().getNom()));
    }
}
