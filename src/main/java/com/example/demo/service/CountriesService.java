package com.example.demo.service;

import com.example.demo.entities.Countries;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CountriesService {

    List<Countries> getAllCountries();

    Page<Countries> getAllCountries(Pageable p);
}