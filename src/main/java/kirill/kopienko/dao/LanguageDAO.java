package kirill.kopienko.dao;

import kirill.kopienko.entities.Language;

public class LanguageDAO extends GenericDAO<Language> {
    public LanguageDAO(Class<Language> classToSet) {
        super(classToSet);
    }
}
