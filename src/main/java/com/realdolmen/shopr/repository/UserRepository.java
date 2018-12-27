package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public User findById(int id) {
        return entityManager.find(User.class, id);
    }

    public List<User> findAll() {
        return entityManager.createNamedQuery(User.FIND_ALL, User.class).getResultList();
    }

    public User findByName(String name) {
        return entityManager.createNamedQuery(User.FIND_BY_NAME, User.class).setParameter("name", name).getSingleResult();
    }

    public void insert(User user) {
        entityManager.persist(user);
    }

}
