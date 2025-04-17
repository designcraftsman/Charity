package com.emsi.charity.repository;

import com.emsi.charity.model.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganisationRepository extends JpaRepository<Organisation, Long> {
    List<Organisation> findByEstApprouveeTrue();
}
