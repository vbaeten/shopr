package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.BookNonFiction;
import com.realdolmen.shopr.domain.enums.BookSubjectNF;
import com.realdolmen.shopr.service.BookNonFictionService;
import com.realdolmen.shopr.util.ShoprEndpoints;

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

    public void initDetailView(Long articleId) {
        this.bookNonFiction = bookNonFictionService.findByPrimaryKey(articleId);
    }

    public List<BookNonFiction> getBookNonFictions() {
        return this.bookNonFictionService.findAll();
    }

    public List<BookSubjectNF> getBookNonFictionSubjects() {
        return Arrays.asList(BookSubjectNF.values());
    }

    public void add(BookNonFiction bookNonFiction) {
        this.bookNonFictionService.insert(bookNonFiction);
    }

    public String update(BookNonFiction bookNonFiction) {this.bookNonFictionService.update(bookNonFiction);
        return ShoprEndpoints.OVERVIEW + "?faces-redirect=true";
    }

    public BookNonFiction getBookNonFictionbyId(Long articleId) {
        return bookNonFictionService.findByPrimaryKey(articleId);
    }

    public String saveBookNonFiction() {
        this.bookNonFictionService.insert(bookNonFiction);
        return ShoprEndpoints.OVERVIEW;
    }

    public String removeBookNonFictionById(Long articleId) {
        bookNonFictionService.removeById(articleId);
        return ShoprEndpoints.OVERVIEW;
    }

    public BookNonFiction getBookNonFiction() {
        return this.bookNonFiction;
    }

}
