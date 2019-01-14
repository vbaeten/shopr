package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.repository.BookFictionRepository;
import com.realdolmen.shopr.repository.CrudRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
@Stateless
public class BookFictionService extends CrudService<BookFiction, Long>{
    @Inject
    private BookFictionRepository bookFictionRepository;

    @Override
    CrudRepository<BookFiction, Long> getRepository() {
        return bookFictionRepository;
    }

//    public BookFiction findBookFictionByArticleId(Long articleId) {
//        return (BookFiction) bookFictionRepository.findByPrimaryKey(articleId);
//    }
//
//    public List<BookFiction> findAll() {
//        return bookFictionRepository.findAll();
//    }
//
//    public void updateTitle(Long articleId, String newTitle) {
//        BookFiction bookFiction = bookFictionRepository.findByPrimaryKey(articleId);
//        bookFiction.setTitle(newTitle);
//    }
//
//    public void insert(BookFiction bookFiction) {
//        bookFictionRepository.insert(bookFiction);
//    }
//
//    public BookFiction update(BookFiction bookFiction) {bookFictionRepository.update(bookFiction);}
//
//    public void removeBookFictionByArticleId (Long articleId) {
//        BookFiction bookFiction = bookFictionRepository.findByPrimaryKey(articleId);
//        bookFictionRepository.remove(bookFiction);
//    }

}

