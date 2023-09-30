package Geo.Repository;

import java.util.ArrayList;

import Geo.DataAccess.CountryFuction;
import Geo.model.Country;

public class CountryRepository implements ICountryRepository {
    CountryFuction countryFuction = new CountryFuction();

    @Override
    public void printCountry(ArrayList<Country> lc) {
        // TODO Auto-generated method stub
        countryFuction.printCountry(lc);
    }

    @Override
    public void printCountrySorted(ArrayList<Country> lc) {
        countryFuction.printCountrySorted(lc);
    }

    @Override
    public void searchByName(ArrayList<Country> lc) {
        countryFuction.searchByName(lc);
    }

    @Override
    public void inputCountry(ArrayList<Country> lc) {
        // TODO Auto-generated method stub
        countryFuction.inputCountry(lc);
    }

}
