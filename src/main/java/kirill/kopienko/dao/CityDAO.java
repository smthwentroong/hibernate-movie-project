package kirill.kopienko.dao;

import kirill.kopienko.entities.City;
import org.hibernate.query.Query;

public class CityDAO extends GenericDAO<City> {
    public CityDAO(Class<City> classToSet) {
        super(classToSet);
    }

    public City getByName(String name) {
        Query<City> query = getCurrentSession().createQuery("select c from City c where c.city = :name", City.class);
        query.setParameter("name", name);
        return query.getSingleResult();
    }
}
