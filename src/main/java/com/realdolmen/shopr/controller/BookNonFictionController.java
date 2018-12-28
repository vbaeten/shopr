package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.BookNonFiction;
import com.realdolmen.shopr.service.BookNonFictionService;

import javax.inject.Inject;

public class BookNonFictionController {

    BookNonFiction bookNonFiction = new BookNonFiction();

    @Inject
    BookNonFictionService bookNonFictionService;


}
