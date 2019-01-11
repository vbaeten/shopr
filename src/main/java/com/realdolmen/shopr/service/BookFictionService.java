package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.BookFictionRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
@Stateless
public class BookFictionService {
    @Inject
    private BookFictionRepository bookFictionRepository;

    public BookFiction findBookFictionByArticleId(Long articleId) {
        return bookFictionRepository.findByArticleId(articleId);
    }

    public List<BookFiction> findAllBookFictions() {
        return bookFictionRepository.findAll();
    }

    public BookFiction findByTitle(String title) {
        return bookFictionRepository.findByTitle(title);
    }

    public void updateTitle(Long articleId, String newTitle) {
        BookFiction bookFiction = bookFictionRepository.findByArticleId(articleId);
        bookFiction.setTitle(newTitle);
    }

    public void insert(BookFiction bookFiction) {
        bookFictionRepository.insert(bookFiction);
    }

    public void update(BookFiction bookFiction) {bookFictionRepository.update(bookFiction);}

    public void removeBookFictionByArticleId (Long articleId) {
        BookFiction bookFiction = bookFictionRepository.findByArticleId(articleId);
        bookFictionRepository.remove(bookFiction);
    }

}

