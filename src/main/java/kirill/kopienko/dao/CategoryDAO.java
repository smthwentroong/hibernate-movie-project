package kirill.kopienko.dao;

import kirill.kopienko.entities.Category;

public class CategoryDAO extends GenericDAO<Category> {
    public CategoryDAO(Class<Category> classToSet) {
        super(classToSet);
    }
}
