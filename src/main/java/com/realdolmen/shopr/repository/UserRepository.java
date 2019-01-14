package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserRepository extends CrudRepository<User, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }

//    public List<User> findAll() {
//        return entityManager.createNamedQuery(User.FIND_ALL, User.class).getResultList();
//    }
//
    public User findByName(String name) {
        return entityManager.createNamedQuery(User.FIND_BY_NAME, User.class).setParameter("name", name).getSingleResult();
    }
//
//    public void insert(User user) {
//        entityManager.persist(user);
//    }
//
//    public User findByUserId(int userId) {
//        return entityManager.find(User.class, userId);
//    }
//
//    public void removeUserByUserId(int userId){
//        User userById = findByUserId(userId);
//        entityManager.remove(userById);
//    }

}
