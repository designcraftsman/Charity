package com.emsi.charity.service;

import com.emsi.charity.dto.OrganisationDTO;
import com.emsi.charity.model.Organisation;
import com.emsi.charity.repository.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrganisationService {

    @Autowired
    private OrganisationRepository organisationRepository;

    public List<OrganisationDTO> getAllOrganisations() {
        return organisationRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public OrganisationDTO getOrganisationById(Long id) {
        Organisation organisation = organisationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Organisation not found"));
        return toDTO(organisation);
    }

    public OrganisationDTO createOrganisation(OrganisationDTO dto) {
        Organisation organisation = toEntity(dto);
        organisation = organisationRepository.save(organisation);
        return toDTO(organisation);
    }

    public OrganisationDTO updateOrganisation(Long id, OrganisationDTO dto) {
        Organisation organisation = organisationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Organisation not found"));

        organisation.setNom(dto.getNom());
        organisation.setLogo(dto.getLogo());
        organisation.setDescription(dto.getDescription());
        organisation.setEstApprouvee(dto.isEstApprouvee());

        organisation = organisationRepository.save(organisation);
        return toDTO(organisation);
    }

    public void deleteOrganisation(Long id) {
        organisationRepository.deleteById(id);
    }

    private OrganisationDTO toDTO(Organisation organisation) {
        return new OrganisationDTO(
                organisation.getId(),
                organisation.getNom(),
                organisation.getLogo(),
                organisation.getDescription(),
                organisation.isEstApprouvee()
        );
    }

    private Organisation toEntity(OrganisationDTO dto) {
        Organisation organisation = new Organisation();
        organisation.setNom(dto.getNom());
        organisation.setLogo(dto.getLogo());
        organisation.setDescription(dto.getDescription());
        organisation.setEstApprouvee(dto.isEstApprouvee());
        return organisation;
    }
}
