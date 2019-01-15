package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.repository.BookRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@Stateless
public class BookService implements Serializable {


    @Inject
    BookRepository bookRepository = new BookRepository();


    public List<Book> findAllBooks() {
        return this.bookRepository.findAllBooks();
    }
}
