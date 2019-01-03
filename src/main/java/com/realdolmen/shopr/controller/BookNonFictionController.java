package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.BookNonFiction;
import com.realdolmen.shopr.service.BookFictionService;
import com.realdolmen.shopr.service.BookNonFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;
@ManagedBean
@SessionScoped
public class BookNonFictionController {

    BookNonFiction bookNonFiction = new BookNonFiction();

    @Inject
    BookNonFictionService bookNonFictionService;

    public BookNonFiction getBookNonFiction() { return  this.bookNonFiction;}

    public BookNonFiction getBookNonFictionbyId(Long id) {
        return bookNonFictionService.findBookNonFictionById(id);
    }

    public void setBookNonFiction(BookNonFiction bookNonFiction){
        this.bookNonFiction = bookNonFiction;
    }

    public List<BookNonFiction> getBookNonFictions(){
        return this.bookNonFictionService.findAllBooksNonFiction();
    }

    public void add(BookNonFiction bookNonFiction){
        this.bookNonFictionService.insert(bookNonFiction);
    }

}
