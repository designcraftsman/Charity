package com.emsi.charity.repository;

import com.emsi.charity.model.Participation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParticipationRepository extends JpaRepository<Participation, Long> {
    List<Participation> findByUtilisateurId(Long utilisateurId);
    List<Participation> findByActionId(Long actionId);
}
