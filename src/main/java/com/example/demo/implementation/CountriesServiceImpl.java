package com.example.demo.implementation;

import com.example.demo.dto.request.CreateCountryRequest;
import com.example.demo.dto.response.GenericResponse;
import com.example.demo.entities.Countries;
import com.example.demo.enums.StatusCodes;
import com.example.demo.enums.StatusDescription;
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

    //Create Country
    @Override
    public GenericResponse createCountry(CreateCountryRequest request) {
        String name = request.getName();
        String code = request.getCode();
        //Validate if any value in request is empty
        if(request.getName().isEmpty() || request.getCode().isEmpty()){
            logger.info("The request has an empty field");
            return new GenericResponse(400, StatusDescription.FAILED, "Invalid Request");
        } else {
            logger.info("The request has no empty field");
            logger.info("Check if duplicate exists by name and code");
            if(checkDuplicateCountry(name, code) == true){
                logger.info("This country already exists");
                return new GenericResponse(400, StatusDescription.FAILED, "Country already exists");
            } else {
                logger.info("This is not a duplicate entry... proceed");
                Countries countries = new Countries();
                countries.setName(name);
                countries.setCode(code);
                countryRepository.save(countries);
            }
        }
        return new GenericResponse(201, StatusDescription.SUCCESS, "Country created successfully");
    }

    //Function to check if new country request already exists
    public boolean checkDuplicateCountry(String name, String code){
        boolean duplicateExists;
        duplicateExists = countryRepository.existsCountriesByNameOrCode(name, code);
        if(duplicateExists == true){
            logger.info("This country already exists");
            return true;
        }
        return false;
    }
}
