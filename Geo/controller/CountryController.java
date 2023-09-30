package Geo.controller;

import java.util.ArrayList;

import Geo.Repository.CountryRepository;
import Geo.model.Country;
import Geo.view.Menu;

public class CountryController extends Menu {
    CountryRepository countryRepository;
    ArrayList<Country> countrieList = new ArrayList<>();
    static String[] option = { "Input the information of 11 countries in East Asia",
            "Display the information of country you've just input",
            "Search the information of country by user-entered name",
            "Display the information of countries sorted name in ascending", "Exit", "Enter your choice: " };

    public CountryController() {
        super("Program", option);
        countryRepository = new CountryRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                countryRepository.inputCountry(countrieList);
                break;
            case 2:
                countryRepository.printCountry(countrieList);
                break;
            case 3:
                countryRepository.searchByName(countrieList);
                break;
            case 4:
                countryRepository.printCountrySorted(countrieList);
                break;
            default:
                break;
        }
    }

}
