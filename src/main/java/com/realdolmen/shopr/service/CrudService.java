package com.realdolmen.shopr.service;

import com.realdolmen.shopr.repository.CrudRepository;

import java.util.List;

public abstract class CrudService<T, PK> {
    abstract CrudRepository<T, PK> getRepository();

    public T findByPrimaryKey(PK primaryKey) {
        return getRepository().findByPrimaryKey(primaryKey);
    }

    public List<T> findAll() {
        return getRepository().findAll();
    }

    public void insert(T entity) {
        getRepository().insert(entity);
    }

    public void update(T entity) {
        getRepository().update(entity);
    }

    public void remove(T entity) {
        getRepository().remove(entity);
    }

    public void removeById(PK primaryKey) {
        getRepository().remove(getRepository().findByPrimaryKey(primaryKey));
    }
}
