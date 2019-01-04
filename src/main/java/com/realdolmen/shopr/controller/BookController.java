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


    public List<Book> getBooks() {

        return this.bookService.findAllBooks();
    }

    public String redirect(String bookType) {

        switch (bookType) {

            case "fiction":
                return "/detail-pages/fiction-detail.xhtml";

            case "non fiction":
                return "/detail-pages/nonFiction-detail.xhtml";

        }
        return "books-overview.xhtml";
    }


    public Book getNewBook() {
        return newBook;
    }

    public void setNewBook(Book newBook) {
        this.newBook = newBook;
    }
}
