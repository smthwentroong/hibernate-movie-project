package kirill.kopienko.dao;

import kirill.kopienko.entities.Address;

public class AddressDAO extends GenericDAO<Address> {
    public AddressDAO(Class<Address> classToSet) {
        super(classToSet);
    }
}
