package kirill.kopienko.dao;

import kirill.kopienko.entities.Customer;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(Class<Customer> classToSet) {
        super(classToSet);
    }
}
