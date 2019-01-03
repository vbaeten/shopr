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

    public Book findBookById(int id) {
        return bookRepository.findById(id);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public void insert(Book book) {
        bookRepository.insert(book);
    }

    public void deleteBook(int id){
        bookRepository.delete(id);
    }

}
