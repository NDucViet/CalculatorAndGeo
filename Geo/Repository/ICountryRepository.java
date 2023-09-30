package Geo.Repository;

import java.util.ArrayList;

import Geo.model.Country;

public interface ICountryRepository {
    public void printCountry(ArrayList<Country> lc);

    public void printCountrySorted(ArrayList<Country> lc);

    public void searchByName(ArrayList<Country> lc);

    public void inputCountry(ArrayList<Country> lc);
}
