package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.BookFictionRepository;

import javax.inject.Inject;
import java.util.List;

public class BookFictionService {
    @Inject
    private BookFictionRepository bookFictionRepository;

    public BookFiction findBookFictionById(Long id) {
        return bookFictionRepository.findById(id);
    }

    public List<BookFiction> findAllBooksFiction() {
        return bookFictionRepository.findAll();
    }

    public BookFiction findByTitle(String title) {
        return bookFictionRepository.findByTitle(title);
    }

    public void updateTitle(Long id, String newTitle) {
        BookFiction bookFiction = bookFictionRepository.findById(id);
        bookFiction.setTitle(newTitle);
    }

    public void insert(BookFiction bookFiction) {
        bookFictionRepository.insert(bookFiction);
    }

}

