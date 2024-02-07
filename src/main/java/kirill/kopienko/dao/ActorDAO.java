package kirill.kopienko.dao;

import kirill.kopienko.entities.Actor;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(Class<Actor> classToSet) {
        super(classToSet);
    }
}
