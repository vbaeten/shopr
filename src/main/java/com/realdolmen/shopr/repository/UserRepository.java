package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public User findByUserId(int userId) {
        return entityManager.find(User.class, userId);
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

    public void removeUserByUserId(int userId){
        User userById = findByUserId(userId);
        entityManager.remove(userById);
    }

}
