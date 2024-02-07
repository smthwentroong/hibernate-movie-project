package kirill.kopienko.dao;

import kirill.kopienko.entities.FilmText;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO(Class<FilmText> classToSet) {
        super(classToSet);
    }
}
