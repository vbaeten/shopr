package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.enums.BookGenre;
import com.realdolmen.shopr.service.BookFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
@ManagedBean
@ViewScoped
public class BookFictionController {
    @Inject
    private BookFictionService bookFictionService;
    private BookFiction bookFiction = new BookFiction();

    public void initDetailView(Long id) {
        this.bookFiction = bookFictionService.findBookFictionById(id);
    }

    public List<BookFiction> getBookFictions() {
        return this.bookFictionService.findAllBookFictions();
    }

    public List<BookGenre> getBookGenres() {
        return Arrays.asList(BookGenre.values());
    }

    public void add(BookFiction bookFiction) {
        this.bookFictionService.insert(bookFiction);
    }

    public BookFiction getBookFictionbyId(Long id) {
        return bookFictionService.findBookFictionById(id);
    }

    public String saveBookFiction() {
        this.bookFictionService.insert(bookFiction);
        return "overview";
    }

    public void removeBookFiction(BookFiction bookFiction) {
        bookFictionService.removeBookFictionById(bookFiction.getId());
    }

    public BookFiction getBookFiction() {
        return this.bookFiction;
    }

    public void setBookFiction(BookFiction bookFiction) {
        this.bookFiction = bookFiction;
    }
}
