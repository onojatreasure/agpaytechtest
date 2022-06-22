package com.example.demo.controller;

import com.example.demo.entities.Countries;
import com.example.demo.service.CountriesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesController {

    @Autowired
    private CountriesService countriesService;

    Logger logger = LoggerFactory.getLogger(CountriesController.class);

//    @GetMapping(value = "/get-all-countries", params = {"page", "size"})
//    public Page<Countries> getAllCardRequests(Pageable p) {
//        logger.info("getting all countries...");
//        return countriesService.getAllCountries(p);
//    }

    @GetMapping(value = "/get-all-countries-http", params = {"page", "size"})
    public ResponseEntity<Countries> getAllCountries(Pageable p) {
        logger.info("getting all countries...");
        Object testCountries = countriesService.getAllCountries(p);
        return new ResponseEntity(testCountries, HttpStatus.OK);
    }
}
