package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BookRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public List<Book> findAll() {
        return entityManager.createNamedQuery(Book.FIND_ALL, Book.class).getResultList();
    }
}
