package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.BookNonFiction;
import com.realdolmen.shopr.domain.enums.BookGenre;
import com.realdolmen.shopr.domain.enums.BookSubjectNF;
import com.realdolmen.shopr.service.BookFictionService;
import com.realdolmen.shopr.service.BookNonFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
@ManagedBean
@RequestScoped
public class BookNonFictionController {

    BookNonFiction bookNonFiction = new BookNonFiction();

    @Inject
    BookNonFictionService bookNonFictionService;

    public List<BookSubjectNF> getBookSubjects() {return Arrays.asList(BookSubjectNF.values());}

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

    public String saveBookNonFiction() {
        this.bookNonFictionService.insert(bookNonFiction);
        return "overview";
    }

}
