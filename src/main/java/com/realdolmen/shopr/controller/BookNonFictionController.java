package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.BookNonFiction;
import com.realdolmen.shopr.service.BookFictionService;
import com.realdolmen.shopr.service.BookNonFictionService;

import javax.inject.Inject;
import java.util.List;

public class BookNonFictionController {

    BookNonFiction bookNonFiction = new BookNonFiction();

    @Inject
    BookNonFictionService bookNonFictionService;

    public BookNonFiction getBookNonFiction() { return  this.bookNonFiction;}

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
