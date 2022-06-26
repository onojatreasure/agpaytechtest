package com.example.demo.controller;

import com.example.demo.dto.request.CreateCountryRequest;
import com.example.demo.dto.response.GenericResponse;
import com.example.demo.entities.Countries;
import com.example.demo.enums.StatusCodes;
import com.example.demo.enums.StatusDescription;
import com.example.demo.service.CountriesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class CountriesController {

    @Autowired
    private CountriesService countriesService;

    @Autowired
    GenericResponse genericResponse;

    Logger logger = LoggerFactory.getLogger(CountriesController.class);

//    @GetMapping(value = "/get-all-countries", params = {"page", "size"})
//    public Page<Countries> getAllCardRequests(Pageable p) {
//        logger.info("getting all countries...");
//        return countriesService.getAllCountries(p);
//    }

    @GetMapping(value = "/get-all-countries", params = {"page" , "size"})
    public ResponseEntity<Object> getAllCountries(Pageable p) {
        logger.info("getting all countries...");
        GenericResponse genericResponse = new GenericResponse<>();
         Object countries = countriesService.getAllCountries(p);
         //Check if countries is not empty. Return success mage if coumtry is not empty
         if (Objects.nonNull(countries)){
             genericResponse =  new GenericResponse(200, StatusDescription.SUCCESS, "Successfully gotten countries", countries);
         } else {
             //Return failed message to client
             genericResponse = new GenericResponse(400, StatusDescription.FAILED, "Invalid Request", countries);
         }

        return new ResponseEntity(genericResponse, HttpStatus.OK);
    }

    @GetMapping(value = "/search",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Countries>> findAll(@RequestParam(value = "name", required = false) final String partialTitle) {
        if (StringUtils.hasText(partialTitle)) {
            return ResponseEntity.status(HttpStatus.OK).body(countriesService.findAll(partialTitle));
        }
        return ResponseEntity.status(HttpStatus.OK).body(countriesService.getAllCountries());
    }

    @PostMapping("/create-country")
    public ResponseEntity<Object> createUser(@RequestBody CreateCountryRequest request) {
        genericResponse = countriesService.createCountry(request);
        if (genericResponse.getStatusDescription() == StatusDescription.SUCCESS) {
            logger.info("country created..");
            return new ResponseEntity(genericResponse, HttpStatus.CREATED);
        } else {
            logger.info("country creation failed..");
            return new ResponseEntity(genericResponse, HttpStatus.BAD_REQUEST);
        }
    }
}
