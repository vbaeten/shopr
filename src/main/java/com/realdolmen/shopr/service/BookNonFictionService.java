package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.BookNonFiction;
import com.realdolmen.shopr.repository.BookNonFictionRepository;
import com.realdolmen.shopr.repository.CrudRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
@Stateless
public class BookNonFictionService extends CrudService<BookNonFiction, Long>{
    @Inject
    private BookNonFictionRepository bookNonFictionRepository;

    @Override
    CrudRepository<BookNonFiction, Long> getRepository() {
        return bookNonFictionRepository;
    }
}
