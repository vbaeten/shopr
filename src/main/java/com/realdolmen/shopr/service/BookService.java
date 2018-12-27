package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.repository.BookRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class BookService {
    @Inject
    private BookRepository bookRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
