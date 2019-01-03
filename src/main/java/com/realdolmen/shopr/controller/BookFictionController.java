package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.service.BookFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;
@ManagedBean
@SessionScoped
public class BookFictionController {
    BookFiction bookFiction = new BookFiction();

    @Inject
    BookFictionService bookFictionService;

    public BookFiction getBookFiction() { return  this.bookFiction;}

    public void setBookFiction(BookFiction bookFiction){
        this.bookFiction = bookFiction;
    }

    public List<BookFiction> getBookFictions(){
        return this.bookFictionService.findAllBooksFictions();
    }

    public void add(BookFiction bookFiction){
        this.bookFictionService.insert(bookFiction);
    }
    public BookFiction getBookFictionbyId(Long id) {
        return bookFictionService.findBookFictionById(id);
    }
}
