package kirill.kopienko.dao;

import kirill.kopienko.entities.Staff;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO(Class<Staff> classToSet) {
        super(classToSet);
    }
}
