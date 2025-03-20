package com.capybara_crud.capybara.capybara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/capybara")
public class CapybaraController {

    @Autowired
    private CapybaraService service;

    @GetMapping("/all")
    public Object getAllCapybara(Model model){
        model.addAttribute("CapybaraList", service.getAllCapybara());
        model.addAttribute("title", "All Capybara");
        return "capybara-list";
    }


    @GetMapping("/{capybaraId}")
    public Object getCapybara(@PathVariable int capybaraId, Model model) {
        model.addAttribute("capybara", service.getCapybaraById(capybaraId));
        model.addAttribute("title", "Capybara #: " + capybaraId);
        return "capybara-details";
    }


    @PostMapping("/new")
    public Object addNewCapybara(Capybara Capybara) {
        service.addNewCapybara(Capybara);
        return "redirect:/capybara/all";
    }


    @PutMapping("/update/{capybaraId}")
    public Object updateCapybara(@PathVariable int CapybaraId, Model model) {
        model.addAttribute("capybara", service.getCapybaraById(CapybaraId));
        model.addAttribute("title", "Update Capybara");
        return "capybara-update";
    }


    @DeleteMapping("/delete/{capybaraId}")
    public Object deleteCapybaraById(@PathVariable int CapybaraId) {
        service.deleteById(CapybaraId);
        return "redirect:/capybara/all";
    }


    @GetMapping("/all/{age}")
    public Object getCapybaraByAge(@PathVariable int age, Model model) {
        model.addAttribute("capybaraList", service.getCapybaraByAge(age));
        model.addAttribute("title", "Capybara by Age: " + age);
        return "capybara-list";
    }


    @GetMapping("/name")
    public Object getCapybaraByName(@RequestParam(name = "search", defaultValue = "") String search, Model model) {
        model.addAttribute("capybaraList", service.getCapybaraByName(search));
        model.addAttribute("title", "Capybara by Name: " + search);
        return "capybara-list";
    }
}

