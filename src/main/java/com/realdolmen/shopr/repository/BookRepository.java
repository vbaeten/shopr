package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BookRepository {


    @PersistenceContext
    private EntityManager entityManager;


    public List<Book> findAllBooks() {
        return entityManager.createNamedQuery(Book.FIND_ALL, Book.class).getResultList();
    }
}
