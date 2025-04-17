package com.emsi.charity.service;

import com.emsi.charity.dto.ParticipationDTO;
import com.emsi.charity.repository.ParticipationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParticipationService {

    private final ParticipationRepository participationRepo;

    public ParticipationService(ParticipationRepository participationRepo) {
        this.participationRepo = participationRepo;
    }

    public List<ParticipationDTO> getParticipationsParUtilisateur(Long utilisateurId) {
        return participationRepo.findByUtilisateurId(utilisateurId)
                .stream()
                .map(p -> new ParticipationDTO(
                        p.getId(),
                        p.getUtilisateur().getNom(),
                        p.getAction().getTitre(),
                        p.getDateParticipation()))
                .collect(Collectors.toList());
    }
}
