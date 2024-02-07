package kirill.kopienko.dao;

import kirill.kopienko.entities.Store;

public class StoreDAO extends GenericDAO<Store> {
    public StoreDAO(Class<Store> classToSet) {
        super(classToSet);
    }
}
