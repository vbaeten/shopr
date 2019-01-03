package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BookRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Book findById(int id) {
        return entityManager.find(Book.class, id);
    }

    public List<Book> findAll() {
        return entityManager.createNamedQuery(Book.FIND_ALL, Book.class).getResultList();
    }

    public void insert(Book book) {
        entityManager.persist(book);
    }

    public void delete(int id) {
        entityManager.remove(entityManager.getReference(Book.class, id));
    }
}
