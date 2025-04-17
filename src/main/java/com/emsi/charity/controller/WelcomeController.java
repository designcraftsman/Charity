package com.emsi.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public ModelAndView welcome() {
        String name = "Welcome to spring mvc Oussama!";
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("name", name);
        return new ModelAndView("welcome",model);
    }
}
