package com.capybara_crud.capybara.capybara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapybaraService {

    @Autowired
    private CapybaraRepository CapybaraRepository;

    public List<Capybara> getAllCapybara() {
        return CapybaraRepository.findAll();
    }

    public Capybara getCapybaraById(int capybaraId) {

        return CapybaraRepository.findById(capybaraId).orElse(null);
    }

    public List<Capybara> getCapybaraByAge(int age) {

        return CapybaraRepository.getCapybaraByAge(age);
    }

    public List<Capybara> getCapybaraByName(String name) {

        return CapybaraRepository.getCapybaraByName(name);
    }

    public void addNewCapybara(Capybara Capybara) {

        CapybaraRepository.save(Capybara);
    }

    public void updateCapybara(Capybara Capybara) {

        CapybaraRepository.save(Capybara);
    }


}
