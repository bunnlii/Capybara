package com.capybara_crud.capybara.capybara;

import jakarta.persistence.*;

@Entity
@Table(name = "capybara")

public class Capybara {

    public String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int capybaraId;
    public String description;
    public int age;

    public Capybara(String name, int capybaraId, String description, int age) {
        this.name = name;
        this.capybaraId = capybaraId;
        this.description = description;
        this.age = age;
    }

    public Capybara() {

    }

    public String getName() {
        return name;
    }

    public int getCapybaraId() {
        return capybaraId;
    }

    public String getDescription() {
        return description;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCapybaraId(int capybaraId) {
        this.capybaraId = capybaraId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
