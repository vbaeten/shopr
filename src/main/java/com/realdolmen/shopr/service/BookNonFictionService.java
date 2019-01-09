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

    public BookNonFiction findBookNonFictionById(Long id) {
        return bookNonFictionRepository.findById(id);
    }

    public List<BookNonFiction> findAllBooksNonFiction() {
        return bookNonFictionRepository.findAll();
    }

    public BookNonFiction findByTitle(String title) {
        return bookNonFictionRepository.findByTitle(title);
    }

    public void updateTitle(Long id, String newTitle) {
        BookNonFiction bookNonFiction = bookNonFictionRepository.findById(id);
        bookNonFiction.setTitle(newTitle);
    }
    public void insert(BookNonFiction bookNonFiction) {
        bookNonFictionRepository.insert(bookNonFiction);
    }

    public void removeBookNonFictionById (Long id) {
        BookNonFiction bookNonFiction = bookNonFictionRepository.findById(id);
        bookNonFictionRepository.remove(bookNonFiction);
    }
}
