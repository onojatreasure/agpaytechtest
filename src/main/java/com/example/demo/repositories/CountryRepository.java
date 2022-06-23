package com.example.demo.repositories;

import com.example.demo.entities.Countries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Countries, Long> {

    Logger logger = LoggerFactory.getLogger("Repos");

    @Query(value = "select *  from countries c ", nativeQuery = true)
    List<Countries> getAllCountries();

    //USING postgres Fuzzy operator
    @Query(value = "SELECT * FROM countries c WHERE ?1 % ANY(STRING_TO_ARRAY(c.name, ' '))", nativeQuery = true)
    List<Countries> findAllMatching(String partialTitle);

    //check if country already exists
//    @Query(value = "SELECT * FROM countries WHERE c.name = ?1 ", nativeQuery = true)
//,   List<Countries>  findDuplicateCountryName(String name);

    //@Query("select case when count(c)> 0 then true else false end from countries c where c.name = ?1")
    boolean existsCountriesByNameOrCode(String name, String code);
}
