package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserRepository {
    @PersistenceContext
    private EntityManager em;

    public User findById(long id) {
        return em.find(User.class, id);
    }

    public List<User> findAll() {
        return em.createNamedQuery(User.FIND_ALL, User.class).getResultList();
    }

    public User findByName(String name) {
        return em.createNamedQuery(User.FIND_BY_NAME, User.class).setParameter("name", name).getSingleResult();
    }

    public void insert(User user) {
        em.persist(user);
    }

    public void remove(long id) {
        User userById = findById(id);
        em.remove(userById);
    }

}
