package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserRepository extends CrudRepository<User, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }

    public User findByName(String name) {
        return entityManager.createNamedQuery(User.FIND_BY_NAME, User.class).setParameter("name", name).getSingleResult();
    }

}
