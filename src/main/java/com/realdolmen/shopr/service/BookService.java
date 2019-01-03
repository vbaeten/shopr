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

    public Book findBookById(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public void updateTitle(Long id, String newTitle) {
        Book book = bookRepository.findById(id);
        book.setTitle(newTitle);
    }
    public void insert(Book book) {
        bookRepository.insert(book);
    }
}
