package Geo.DataAccess;

import java.util.ArrayList;
import java.util.Collections;

import Geo.Common.Valid;
import Geo.model.Country;

public class CountryFuction {
    Valid valid = new Valid();
    public  void inputCountry(ArrayList<Country> lc) {
        System.out.print("Enter code of contry: ");
        String countryCode = valid.checkInputString();
        //check code contry exist or not
        if (!valid.checkCountryExist(lc, countryCode)) {
            System.err.println("Country exist.");
            return;
        }
        System.out.print("Enter name of contry: ");
        String countryName = valid.checkInputString();
        System.out.print("Enter total area: ");
        double countryArea = valid.checkInputDouble();
        System.out.print("Enter terrain of contry: ");
        String countryTerrain = valid.checkInputString();
        lc.add(new Country(countryTerrain, countryCode, countryName, countryArea));
        System.err.println("Add successful.");
    }
    public void printCountry(ArrayList<Country> lc) {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    public void printCountrySorted(ArrayList<Country> lc) {
        Collections.sort(lc);
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    public void searchByName(ArrayList<Country> lc) {
        System.out.print("Enter the name you want to search for: ");
        String countryName = valid.checkInputString();
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                country.display();
            }
        }
    }
}
