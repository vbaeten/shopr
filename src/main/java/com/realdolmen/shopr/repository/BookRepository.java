package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.domain.BookFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BookRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Book findById(Long id) {
        return entityManager.find(Book.class, id);
    }

    public List<Book> findAll() {
        return entityManager.createQuery("select f from Book f ", Book.class).getResultList();
    }

    public Book findByTitle(String title) {
        return entityManager.createQuery(" select f from Book f where f.title =: title", Book.class).getSingleResult();
    }

    public void insert(Book book) {
        entityManager.persist(book);
    }
}
