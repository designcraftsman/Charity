package com.emsi.charity.service;

import com.emsi.charity.dto.DonDTO;
import com.emsi.charity.model.Don;
import com.emsi.charity.repository.DonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DonService {

    private final DonRepository donRepo;

    public DonService(DonRepository donRepo) {
        this.donRepo = donRepo;
    }

    public List<DonDTO> getDonsParUtilisateur(Long utilisateurId) {
        return donRepo.findByUtilisateurId(utilisateurId)
                .stream()
                .map(d -> new DonDTO(d.getId(),
                        d.getUtilisateur().getNom(),
                        d.getAction().getTitre(),
                        d.getMontant(),
                        d.getDateDon(),
                        d.getMethodePaiement()))
                .collect(Collectors.toList());
    }
}
