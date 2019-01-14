package com.realdolmen.shopr.repository;

import javax.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class CrudRepository<T, PK> {
    private final Class<T> entityClass;

    @SuppressWarnings("unchecked")
    public CrudRepository() {
        this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    abstract EntityManager getEntityManager();

    public T findByPrimaryKey(PK primaryKey) {
        return getEntityManager().find(entityClass, primaryKey);
    }

    public List<T> findAll() {
        String query = String.format("select e from %s e ", entityClass.getName());
        return getEntityManager().createQuery(query, entityClass).getResultList();
    }

    public T insert(T entity) {
        getEntityManager().persist(entity);
        return entity;
    }

    public T update(T entity) {
        return getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(entity);}
}