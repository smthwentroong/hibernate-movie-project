package kirill.kopienko.dao;

import kirill.kopienko.entities.Film;

public class FilmDAO extends GenericDAO<Film> {
    public FilmDAO(Class<Film> classToSet) {
        super(classToSet);
    }
}
