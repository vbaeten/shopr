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
}
