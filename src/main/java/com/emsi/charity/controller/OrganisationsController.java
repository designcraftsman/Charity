package com.emsi.charity.controller;

import com.emsi.charity.dto.OrganisationDTO;
import com.emsi.charity.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/organisations")
public class OrganisationsController {

    @Autowired
    private OrganisationService organisationService;

    @GetMapping
    public String listOrganisations(Model model) {
        model.addAttribute("organisations", organisationService.getAllOrganisations());
        return "pages/organisations/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("organisation", new OrganisationDTO());
        return "pages/organisations/form";
    }

    @PostMapping("/create")
    public String createOrganisation(@ModelAttribute OrganisationDTO organisation) {
        organisationService.createOrganisation(organisation);
        return "redirect:/organisations";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("organisation", organisationService.getOrganisationById(id));
        return "pages/organisations/form";
    }

    @PostMapping("/edit/{id}")
    public String updateOrganisation(@PathVariable Long id, @ModelAttribute OrganisationDTO organisation) {
        organisationService.updateOrganisation(id, organisation);
        return "redirect:/organisations";
    }

    @GetMapping("/delete/{id}")
    public String deleteOrganisation(@PathVariable Long id) {
        organisationService.deleteOrganisation(id);
        return "redirect:/organisations";
    }
}
