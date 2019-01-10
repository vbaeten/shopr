package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.BookNonFiction;
import com.realdolmen.shopr.repository.BookNonFictionRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
@Stateless
public class BookNonFictionService {
    @Inject
    private BookNonFictionRepository bookNonFictionRepository;

    public BookNonFiction findBookNonFictionByArticleId(Long articleId) {
        return bookNonFictionRepository.findByArticleId(articleId);
    }

    public List<BookNonFiction> findAllBooksNonFiction() {
        return bookNonFictionRepository.findAll();
    }

    public BookNonFiction findByTitle(String title) {
        return bookNonFictionRepository.findByTitle(title);
    }

    public void updateTitle(Long articleId, String newTitle) {
        BookNonFiction bookNonFiction = bookNonFictionRepository.findByArticleId(articleId);
        bookNonFiction.setTitle(newTitle);
    }
    public void insert(BookNonFiction bookNonFiction) {
        bookNonFictionRepository.insert(bookNonFiction);
    }

    public void removeBookNonFictionByArticleId (Long articleId) {
        BookNonFiction bookNonFiction = bookNonFictionRepository.findByArticleId(articleId);
        bookNonFictionRepository.remove(bookNonFiction);
    }
}
