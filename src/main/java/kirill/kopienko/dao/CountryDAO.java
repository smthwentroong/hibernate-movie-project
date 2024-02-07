package kirill.kopienko.dao;

import kirill.kopienko.entities.Country;

public class CountryDAO extends GenericDAO<Country> {
    public CountryDAO(Class<Country> classToSet) {
        super(classToSet);
    }
}
