package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.enums.BookGenre;
import com.realdolmen.shopr.service.BookFictionService;
import com.realdolmen.shopr.util.ShoprEndpoints;

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

    public void initDetailView(Long articleId) {
        this.bookFiction = bookFictionService.findBookFictionByArticleId(articleId);
    }

    public List<BookFiction> getBookFictions() {
        return this.bookFictionService.findAll();
    }

    public List<BookGenre> getBookGenres() {
        return Arrays.asList(BookGenre.values());
    }

    public void add(BookFiction bookFiction) {
        this.bookFictionService.insert(bookFiction);
    }

    public String update(BookFiction bookFiction) {this.bookFictionService.update(bookFiction);
        return ShoprEndpoints.OVERVIEW + "?faces-redirect=true";
    }

    public BookFiction getBookFictionbyId(Long articleId) {
        return bookFictionService.findBookFictionByArticleId(articleId);
    }

    public String saveBookFiction() {
        this.bookFictionService.insert(bookFiction);
        return ShoprEndpoints.OVERVIEW;
    }

    public String removeBookFiction(BookFiction bookFiction) {
        bookFictionService.removeBookFictionByArticleId(bookFiction.getArticleId());
        return ShoprEndpoints.OVERVIEW;
    }

    public BookFiction getBookFiction() {
        return this.bookFiction;
    }

    public void setBookFiction(BookFiction bookFiction) {
        this.bookFiction = bookFiction;
    }
}
