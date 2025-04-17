package com.emsi.charity.repository;

import com.emsi.charity.model.ActionCharite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionChariteRepository extends JpaRepository<ActionCharite, Long> {
    Page<ActionCharite> findByCategorie(String categorie, Pageable pageable);
    Page<ActionCharite> findByTitreContainingIgnoreCase(String motCle, Pageable pageable);
}
