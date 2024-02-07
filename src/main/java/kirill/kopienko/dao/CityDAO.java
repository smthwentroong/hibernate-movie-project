package kirill.kopienko.dao;

import kirill.kopienko.entities.City;

public class CityDAO extends GenericDAO<City> {
    public CityDAO(Class<City> classToSet) {
        super(classToSet);
    }
}
