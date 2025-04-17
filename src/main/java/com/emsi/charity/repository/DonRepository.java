package com.emsi.charity.repository;

import com.emsi.charity.model.Don;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonRepository extends JpaRepository<Don, Long> {
    List<Don> findByUtilisateurId(Long utilisateurId);
    List<Don> findByActionId(Long actionId);
}
