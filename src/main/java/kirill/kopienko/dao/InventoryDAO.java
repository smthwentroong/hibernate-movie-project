package kirill.kopienko.dao;

import kirill.kopienko.entities.Inventory;

public class InventoryDAO extends GenericDAO<Inventory> {
    public InventoryDAO(Class<Inventory> classToSet) {
        super(classToSet);
    }
}
