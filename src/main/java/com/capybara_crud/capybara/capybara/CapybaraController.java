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

    //not finished
    @GetMapping("/all")
    public Object getAllCapybara(Model model){
        model.addAttribute("CapybaraList", service.getAllCapybara());
        model.addAttribute("title", "All Capybara");
        return "capybara-list";
    }

    //not finished
    @GetMapping("/{capybaraId}")
    public Object getCapybara(@PathVariable int capybaraId) {

    }
    //not finished
    @PostMapping("/new")
    public Object addNewCapybara() {
    }

    //not finished
    @PutMapping("/update/{capybaraId}")
    public Object updateCapybara() {
    }

    //not finished
    @DeleteMapping("/delete/{capybaraId}")
    public Object deleteCapybaraById() {
    }

    //not finished
    @GetMapping("/all/{age}")
    public Object getCapybaraByAge() {
    }

    //not finished
    @GetMapping("/name")
    public Object getCapybaraByName() {
    }
}

