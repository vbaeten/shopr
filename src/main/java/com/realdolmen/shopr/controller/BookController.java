package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.service.BookService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class BookController {

    private Book newBook = new Book();

    @Inject
    private BookService bookService;

    public Book getNewBook() {
        return newBook;
    }

    public void setNewBook(Book newBook) {
        this.newBook = newBook;
    }

    public List<Book> getBooks() {
        return this.bookService.findAllBooks();
    }

    public void submit() {
        this.bookService.insert(newBook);
    }

    public void deleteBook(int id){
        this.bookService.deleteBook(id);
    }

}
