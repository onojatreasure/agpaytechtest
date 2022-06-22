package com.example.demo.config;

import com.example.demo.entities.Countries;
import com.example.demo.repositories.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupConfig implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(this.getClass()) ;

    private CountryRepository countryRepository;

    @Autowired
    public StartupConfig(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.createDefaultCountries();
    }

    private void createDefaultCountries(){
        logger.info("Checking if countries already exist is dabatase");
        if(countryRepository.findAll().isEmpty()){
            logger.info("Country table is empty. Creating countries");

            Countries countries = new Countries();
            countries.setName("Afghanistan");
            countries.setCode("AF");

            countries.setName("land Islands");
            countries.setCode("AX");

            countries.setName("Albania");
            countries.setCode("AL");

            countries.setName("Algeria");
            countries.setCode("DZ");

            countries.setName("American Samoa");
            countries.setCode("AS");

            countries.setName("AndorrA");
            countries.setCode("AD");

            countries.setName("Angola");
            countries.setCode("AO");

            countries.setName("Anguilla");
            countries.setCode("AI");

            countries.setName("Antarctica");
            countries.setCode("AQ");

            countries.setName("Antigua and Barbuda");
            countries.setCode("AG");

            countries.setName("Argentina");
            countries.setCode("AR");

            countries.setName("Armenia");
            countries.setCode("AM");

            countries.setName("Aruba");
            countries.setCode("AW");

            countries.setName("Australia");
            countries.setCode("AU");

            countries.setName("Austria");
            countries.setCode("AT");

            countries.setName("Azerbaijan");
            countries.setCode("AZ");

            countries.setName("Bahamas");
            countries.setCode("BS");

            countries.setName("Bahrain");
            countries.setCode("BH");

            countries.setName("Bangladesh");
            countries.setCode("BD");

            countries.setName("Barbados");
            countries.setCode("BB");

            countries.setName("Belarus");
            countries.setCode("BY");

            countries.setName("Belgium");
            countries.setCode("BE");

            countries.setName("Belize");
            countries.setCode("BZ");

            countries.setName("Benin");
            countries.setCode("BJ");

            countries.setName("Bermuda");
            countries.setCode("BM");

            countries.setName("Bhutan");
            countries.setCode("BT");

            countries.setName("Bolivia");
            countries.setCode("BO");

            countries.setName("Bosnia and Herzegovina");
            countries.setCode("BA");

            countries.setName("Botswana");
            countries.setCode("BW");

            countries.setName("Bouvet Island");
            countries.setCode("BV");

            countries.setName("Brazil");
            countries.setCode("BR");

            countries.setName("British Indian Ocean Territory");
            countries.setCode("IO");

            countries.setName("Brunei Darussala");
            countries.setCode("BN");

            countries.setName("Bulgaria");
            countries.setCode("BG");

            countries.setName("Burkina Faso");
            countries.setCode("BF");

            countries.setName("Burundi");
            countries.setCode("BI");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");

            countries.setName("");
            countries.setCode("");





        }
    }
}
