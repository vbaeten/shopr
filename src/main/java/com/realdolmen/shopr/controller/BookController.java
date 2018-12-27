package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.service.BookService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class BookController {
    private Book book = new Fiction();

    @Inject
    private BookService bookService;

    public List<Book> getBooks() {
        return this.bookService.findAllBooks();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
