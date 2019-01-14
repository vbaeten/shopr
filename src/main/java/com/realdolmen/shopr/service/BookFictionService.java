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
}

