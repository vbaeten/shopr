package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.BookFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.print.Book;
import java.util.List;

public class BookRepository extends CrudRepository<Book, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }

//    public Book findById(Long articleId) {
//        return entityManager.find(Book.class, articleId);
//    }
//
//    public List<Book> findAll() {
//        return entityManager.createQuery("select f from Book f ", Book.class).getResultList();
//    }
//
//    public Book findByTitle(String title) {
//        return entityManager.createQuery(" select f from Book f where f.title =: title", Book.class).getSingleResult();
//    }
//
//    public void insert(Book book) {
//        entityManager.persist(book);
//    }
}
