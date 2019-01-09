package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.BookNonFiction;
import com.realdolmen.shopr.domain.enums.BookSubjectNF;
import com.realdolmen.shopr.service.BookNonFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
@ManagedBean
@ViewScoped
public class BookNonFictionController {

    @Inject
    private BookNonFictionService bookNonFictionService;
    private BookNonFiction bookNonFiction = new BookNonFiction();

    public void initDetailView(Long id) {
        this.bookNonFiction = bookNonFictionService.findBookNonFictionById(id);
    }

    public List<BookNonFiction> getBookNonFictions() {
        return this.bookNonFictionService.findAllBooksNonFiction();
    }

    public List<BookSubjectNF> getBookNonFictionSubjects() {
        return Arrays.asList(BookSubjectNF.values());
    }

    public void add(BookNonFiction bookNonFiction) {
        this.bookNonFictionService.insert(bookNonFiction);
    }

    public BookNonFiction getBookNonFictionbyId(Long id) {
        return bookNonFictionService.findBookNonFictionById(id);
    }

    public String saveBookNonFiction() {
        this.bookNonFictionService.insert(bookNonFiction);
        return "overview";
    }

    public void removeBookNonFiction(BookNonFiction bookNonFiction) {
        bookNonFictionService.removeBookNonFictionById(bookNonFiction.getId());
    }

    public BookNonFiction getBookNonFiction() {
        return this.bookNonFiction;
    }

}
