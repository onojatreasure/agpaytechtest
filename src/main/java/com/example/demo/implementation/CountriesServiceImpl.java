package com.example.demo.implementation;

import com.example.demo.entities.Countries;
import com.example.demo.repositories.CountryRepository;
import com.example.demo.service.CountriesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountriesServiceImpl implements CountriesService {

    Logger logger = LoggerFactory.getLogger(CountriesServiceImpl.class);

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Countries> getAllCountries() {
        List<Countries> countries = countryRepository.getAllCountries();
        logger.info("Get All Users ");
        return countries;
    }

    public Page<Countries> getAllCountries(Pageable p) {
        return countryRepository.findAll(p);
    }

    //fuzzy
    public List<Countries> findAll( String partialTitle) {
        return countryRepository.findAllMatching(partialTitle);
    }

}
