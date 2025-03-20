package com.capybara_crud.capybara.capybara;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CapybaraRepository extends JpaRepository<Capybara, Integer> {

    List<Capybara> getCapybaraByAge(int age);

    @Query(value = "select * from capybara s where s.name like %?1% ", nativeQuery = true)
    List<Capybara> getCapybaraByName(String name);

}

