package kirill.kopienko.dao;

import kirill.kopienko.entities.Rental;

public class RentalDAO extends GenericDAO<Rental> {
    public RentalDAO(Class<Rental> classToSet) {
        super(classToSet);
    }
}
