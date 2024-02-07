package kirill.kopienko.dao;

import kirill.kopienko.utils.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public abstract class GenericDAO<T> {
    private final Class<T> clazz;

    public GenericDAO(final Class<T> classToSet) {
        this.clazz = classToSet;
    }

    public T getById(final int id) {
        return (T) getCurrentSession().get(clazz, id);
    }

    public List<T> getItems(int offset, int count) {
        Query query = getCurrentSession().createQuery("from " + clazz.getName(), clazz);
        query.setFirstResult(offset);
        query.setMaxResults(count);
        return query.list();
    }

    public List<T> findAll(final T entity) {
        return getCurrentSession().createQuery("from " + clazz.getName(), clazz).list();
    }

    public T save(final T entity) {
        getCurrentSession().saveOrUpdate(entity);
        return entity;
    }

    public T update(final T entity) {
        getCurrentSession().saveOrUpdate(entity);
        return entity;
    }

    public void delete(final T entity){
        getCurrentSession().delete(entity);
    }

    public void deleteById(final int entityId) {
        final T entity = getById(entityId);
        getCurrentSession().delete(entity);
    }

    public Session getCurrentSession() {
        return MySessionFactory.getSessionFactory().getCurrentSession();
    }
}
