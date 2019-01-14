package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BookNonFictionRepository extends CrudRepository<BookNonFiction, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }

//    public BookNonFiction findByArticleId(Long articleId) {
//        return entityManager.find(BookNonFiction.class, articleId);
//    }
//
//    public List<BookNonFiction> findAll() {
//        return entityManager.createQuery("select f from BookNonFiction f ", BookNonFiction.class).getResultList();
//    }
//
//    public BookNonFiction findByTitle(String title) {
//        return entityManager.createQuery(" select f from BookNonFiction f where f.title =: title", BookNonFiction.class).getSingleResult();
//    }
//
//    public void insert(BookNonFiction bookNonFiction) {
//        entityManager.persist(bookNonFiction);
//    }
//
//    public void update(BookNonFiction bookNonFiction) {entityManager.merge(bookNonFiction);}
//
//    public void remove(BookNonFiction bookNonFiction) {
//        entityManager.remove(bookNonFiction);}
}

