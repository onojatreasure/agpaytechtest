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
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("land Islands");
            countries.setCode("AX");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Albania");
            countries.setCode("AL");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Algeria");
            countries.setCode("DZ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("American Samoa");
            countries.setCode("AS");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("AndorrA");
            countries.setCode("AD");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Angola");
            countries.setCode("AO");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Anguilla");
            countries.setCode("AI");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Antarctica");
            countries.setCode("AQ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Antigua and Barbuda");
            countries.setCode("AG");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Argentina");
            countries.setCode("AR");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Armenia");
            countries.setCode("AM");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Aruba");
            countries.setCode("AW");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Australia");
            countries.setCode("AU");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Austria");
            countries.setCode("AT");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Azerbaijan");
            countries.setCode("AZ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Bahamas");
            countries.setCode("BS");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Bahrain");
            countries.setCode("BH");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Bangladesh");
            countries.setCode("BD");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Barbados");
            countries.setCode("BB");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Belarus");
            countries.setCode("BY");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Belgium");
            countries.setCode("BE");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Belize");
            countries.setCode("BZ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Benin");
            countries.setCode("BJ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Bermuda");
            countries.setCode("BM");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Bhutan");
            countries.setCode("BT");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Bolivia");
            countries.setCode("BO");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Bosnia and Herzegovina");
            countries.setCode("BA");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Botswana");
            countries.setCode("BW");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Bouvet Island");
            countries.setCode("BV");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Brazil");
            countries.setCode("BR");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("British Indian Ocean Territory");
            countries.setCode("IO");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Brunei Darussala");
            countries.setCode("BN");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Bulgaria");
            countries.setCode("BG");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Burkina Faso");
            countries.setCode("BF");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Burundi");
            countries.setCode("BI");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Cambodia");
            countries.setCode("KH");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Cameroon");
            countries.setCode("CM");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Canada");
            countries.setCode("CA");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Cape Verde");
            countries.setCode("CV");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Cayman Islands");
            countries.setCode("KY");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Central African Republic");
            countries.setCode("CF");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Chad");
            countries.setCode("TD");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Chile");
            countries.setCode("CL");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("China");
            countries.setCode("CN");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Christmas Island");
            countries.setCode("CX");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Cocos (Keeling) Islands");
            countries.setCode("CC");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Colombia");
            countries.setCode("CO");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Comoros");
            countries.setCode("KM");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Congo");
            countries.setCode("CG");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Congo, The Democratic Republic of the");
            countries.setCode("CD");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Cook Islands");
            countries.setCode("CK");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Costa Rica");
            countries.setCode("CR");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Cote D\"Ivoire");
            countries.setCode("CI");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Croatia");
            countries.setCode("HR");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Cuba");
            countries.setCode("CU");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Cyprus");
            countries.setCode("CY");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Czech Republic");
            countries.setCode("CZ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Denmark");
            countries.setCode("DK");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Djibouti");
            countries.setCode("DJ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Dominica");
            countries.setCode("DM");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Dominican Republic");
            countries.setCode("DO");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Ecuador");
            countries.setCode("EC");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Egypt");
            countries.setCode("EG");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("El Salvador");
            countries.setCode("SV");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Equatorial Guinea");
            countries.setCode("GQ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Eritrea");
            countries.setCode("ER");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Estonia");
            countries.setCode("EE");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Ethiopia");
            countries.setCode("ET");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Falkland Islands (Malvinas)");
            countries.setCode("FK");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Faroe Islands");
            countries.setCode("FO");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Fiji");
            countries.setCode("FJ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Finland");
            countries.setCode("FI");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("France");
            countries.setCode("FR");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("French Guiana");
            countries.setCode("GF");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("French Polynesia");
            countries.setCode("PF");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("French Southern Territories");
            countries.setCode("TF");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Gabon");
            countries.setCode("GA");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Gambia");
            countries.setCode("GM");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Georgia");
            countries.setCode("GE");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Germany");
            countries.setCode("DE");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Ghana");
            countries.setCode("GH");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Gibraltar");
            countries.setCode("GI");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Greece");
            countries.setCode("GR");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Greenland");
            countries.setCode("GL");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Grenada");
            countries.setCode("GD");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Guadeloupe");
            countries.setCode("GP");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Guam");
            countries.setCode("GU");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Guatemala");
            countries.setCode("GT");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Guernsey");
            countries.setCode("GG");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Guinea");
            countries.setCode("GN");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Guinea-Bissau");
            countries.setCode("GW");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Guyana");
            countries.setCode("GY");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Haiti");
            countries.setCode("HT");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Heard Island and Mcdonald Islands");
            countries.setCode("HM");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Holy See (Vatican City State)");
            countries.setCode("VA");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Honduras");
            countries.setCode("HN");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Hong Kong");
            countries.setCode("HK");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Hungary");
            countries.setCode("HU");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Iceland");
            countries.setCode("IS");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("India");
            countries.setCode("IN");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Indonesia");
            countries.setCode("ID");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Iran, Islamic Republic Of");
            countries.setCode("IR");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Iraq");
            countries.setCode("IQ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Ireland");
            countries.setCode("IE");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Isle of Man");
            countries.setCode("IM");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Israel");
            countries.setCode("IL");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Italy");
            countries.setCode("IT");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Jamaica");
            countries.setCode("JM");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Japan");
            countries.setCode("JP");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Jersey");
            countries.setCode("JE");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Jordan");
            countries.setCode("JP");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Kazakhstan");
            countries.setCode("KE");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Kenya");
            countries.setCode("KE");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Kiribati");
            countries.setCode("KI");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Korea, Democratic People\"S Republic of");
            countries.setCode("KP");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Korea, Republic of");
            countries.setCode("KR");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Kuwait");
            countries.setCode("KW");
            countryRepository.save(countries);

            countries.setName("Kyrgyzstan");
            countries.setCode("KG");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Lao People\"S Democratic Republic");
            countries.setCode("LA");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Latvia");
            countries.setCode("LV");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Lebanon");
            countries.setCode("LB");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Lesotho");
            countries.setCode("LS");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Liberia");
            countries.setCode("LR");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Libyan Arab Jamahiriya");
            countries.setCode("LY");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Liechtenstein");
            countries.setCode("LI");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Lithuania");
            countries.setCode("LT");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Luxembourg");
            countries.setCode("LU");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Macao");
            countries.setCode("MO");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Macedonia, The Former Yugoslav Republic of");
            countries.setCode("MK");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Madagascar");
            countries.setCode("MG");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Malawi");
            countries.setCode("MW");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Malaysia");
            countries.setCode("MY");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Maldives");
            countries.setCode("MV");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Mali");
            countries.setCode("ML");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Malta");
            countries.setCode("MT");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Marshall Islands");
            countries.setCode("MH");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Martinique");
            countries.setCode("MQ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Mauritania");
            countries.setCode("MR");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Mauritius");
            countries.setCode("MU");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Mayotte");
            countries.setCode("YT");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Mexico");
            countries.setCode("MX");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Micronesia, Federated States of");
            countries.setCode("FM");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Moldova, Republic of");
            countries.setCode("MD");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Monaco");
            countries.setCode("MC");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Mongolia");
            countries.setCode("MN");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Montenegro");
            countries.setCode("ME");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Montserrat");
            countries.setCode("MS");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Morocco");
            countries.setCode("MA");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Mozambique");
            countries.setCode("MZ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Myanmar");
            countries.setCode("MM");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Namibia");
            countries.setCode("NA");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Nauru");
            countries.setCode("NR");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Nepal");
            countries.setCode("NP");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Netherlands");
            countries.setCode("NL");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Netherlands Antilles");
            countries.setCode("AN");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("New Caledonia");
            countries.setCode("NC");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("New Zealand");
            countries.setCode("NZ");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Nicaragua");
            countries.setCode("NI");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Niger");
            countries.setCode("NE");
            countryRepository.save(countries);

            countries = new Countries();
            countries.setName("Nigeria");
            countries.setCode("NG");
            countryRepository.save(countries);

        }else{
            logger.info("Countries already exist. ...");
        }
    }
}
