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

    // http://localhost:8080/capybara/all

    @GetMapping("/all")
    public Object getAllCapybara(){
        return new ResponseEntity<>(service.getAllCapybara(), HttpStatus.OK);
    }

    // http://localhost:8080/capybara/{id}

    @GetMapping("/{capybaraId}")
    public Object getCapybara(@PathVariable int capybaraId) {
        return new ResponseEntity<>(service.getCapybaraById(capybaraId), HttpStatus.OK);
    }

    // http://localhost:8080/capybara/new {enter info}

    @PostMapping("/new")
    public Object addNewCapybara(@RequestBody Capybara Capybara) {
        service.addNewCapybara(Capybara);
        return new ResponseEntity<>(service.getAllCapybara(), HttpStatus.CREATED);
    }

    // http://localhost:8080/capybara/update/{id}/ {enter info}

    @PutMapping("/update/{capybaraId}")
    public Object updateCapybara(@PathVariable int capybaraId, @RequestBody Capybara capybara) {
        service.updateCapybara(capybaraId, capybara);
        return new ResponseEntity<>(service.getCapybaraById(capybaraId), HttpStatus.OK);
    }


    // http://localhost:8080/capybara/delete/{id}

    @DeleteMapping("/delete/{capybaraId}")
    public Object deleteCapybaraById(@PathVariable int capybaraId) {
        service.deleteById(capybaraId);
        return new ResponseEntity<>(service.getAllCapybara(), HttpStatus.OK);
    }

    // http://localhost:8080/capybara/{enter age}

    @GetMapping("/all/{age}")
    public Object getCapybaraByAge(@PathVariable int age) {
        return new ResponseEntity<>(service.getCapybaraByAge(age), HttpStatus.OK);
    }

    // http://localhost:8080/capybara/name?search={enter name}

    @GetMapping("/name")
    public Object getCapybaraByName(@RequestParam(name = "search", defaultValue = "") String search, Model model) {
        return new ResponseEntity<>(service.getCapybaraByName(search), HttpStatus.OK);
    }
}

