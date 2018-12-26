package com.realdolmen.shopr.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BookNonFiction extends Book {
    private BookSubjectNF bookSubjectNF;

    public BookNonFiction () {
    }

    public BookNonFiction(String title, BigDecimal price, String supplierId, String author, String isbn, int numberOfPages, BookSubjectNF bookSubjectNF) {
        super(title, price, supplierId, author, isbn, numberOfPages);
        this.bookSubjectNF = bookSubjectNF;
    }

    public BookSubjectNF getBookSubjectNF() {
        return bookSubjectNF;
    }

    public void setBookSubjectNF(BookSubjectNF bookSubjectNF) {
        this.bookSubjectNF = bookSubjectNF;
    }
}
