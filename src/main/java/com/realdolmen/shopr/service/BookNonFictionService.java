package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.BookNonFiction;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.BookNonFictionRepository;
import com.realdolmen.shopr.repository.CrudRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
@Stateless
public class BookNonFictionService extends CrudService<BookNonFiction, Long>{
    @Inject
    private BookNonFictionRepository bookNonFictionRepository;

    @Override
    CrudRepository<BookNonFiction, Long> getRepository() {
        return bookNonFictionRepository;
    }

//    public BookNonFiction findBookNonFictionByArticleId(Long articleId) {
//        return bookNonFictionRepository.findByPrimaryKey(articleId);
//    }
//
//    public List<BookNonFiction> findAllBooksNonFiction() {
//        return bookNonFictionRepository.findAll();
//    }
//
//    //public BookNonFiction findByTitle(String title) {
//        return bookNonFictionRepository.findByTitle(title);
//    }
//
//    public void updateTitle(Long articleId, String newTitle) {
//        BookNonFiction bookNonFiction = bookNonFictionRepository.findByPrimaryKey(articleId);
//        bookNonFiction.setTitle(newTitle);
//    }
//    public void insert(BookNonFiction bookNonFiction) {
//        bookNonFictionRepository.insert(bookNonFiction);
//    }
//
//    public void update(BookNonFiction bookNonFiction) {bookNonFictionRepository.update(bookNonFiction);}
//
//    public void removeBookNonFictionByArticleId (Long articleId) {
//        BookNonFiction bookNonFiction = bookNonFictionRepository.findByPrimaryKey(articleId);
//        bookNonFictionRepository.remove(bookNonFiction);
//    }
}
