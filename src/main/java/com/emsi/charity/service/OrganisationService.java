package com.emsi.charity.service;
import com.emsi.charity.dto.OrganisationDTO;
import com.emsi.charity.model.Organisation;
import com.emsi.charity.repository.OrganisationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrganisationService {

    private final OrganisationRepository organisationRepo;

    public OrganisationService(OrganisationRepository organisationRepo) {
        this.organisationRepo = organisationRepo;
    }

    public List<OrganisationDTO> getOrganisationsApprouvees() {
        return organisationRepo.findByEstApprouveeTrue()
                .stream()
                .map(o -> new OrganisationDTO(
                        o.getId(), o.getNom(), o.getLogo(), o.getDescription(), o.isEstApprouvee()))
                .collect(Collectors.toList());
    }
}
