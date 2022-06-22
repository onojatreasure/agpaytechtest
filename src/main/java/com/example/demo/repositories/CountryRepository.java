package com.example.demo.repositories;

import com.example.demo.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Countries, Long> {
}
