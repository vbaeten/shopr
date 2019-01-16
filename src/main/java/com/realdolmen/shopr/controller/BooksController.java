package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.service.BookService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class BooksController {
    @Inject
    private BookService bookService;

    public List<Book> getBooks() {
        return bookService.findAllBooks();
    }
}
