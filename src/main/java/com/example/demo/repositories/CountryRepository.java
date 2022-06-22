package com.example.demo.repositories;

import com.example.demo.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Countries, Long> {

    @Query(value = "select *  from countries c ", nativeQuery = true)
    List<Countries> getAllCountries();

}
