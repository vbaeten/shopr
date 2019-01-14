package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BookFictionRepository extends CrudRepository <BookFiction, Long>{
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }

//    public BookFiction findByArticleId(Long articleId) {
//        return entityManager.find(BookFiction.class, articleId);
//    }
//
//    public List<BookFiction> findAll() {
//        return entityManager.createQuery("select f from BookFiction f ", BookFiction.class).getResultList();
//    }
//
//    public BookFiction findByTitle(String title) {
//        return entityManager.createQuery(" select f from BookFiction f where f.title =: title", BookFiction.class).getSingleResult();
//    }
//
//    public void insert(BookFiction bookFiction) {
//        entityManager.persist(bookFiction);
//    }
//
//    public void update(BookFiction bookFiction) {entityManager.merge(bookFiction);}
//
//    public void remove(BookFiction bookFiction) {
//        entityManager.remove(bookFiction);}

}
