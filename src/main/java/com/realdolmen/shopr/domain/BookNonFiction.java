package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.domain.enums.BookSubjectNF;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("NonFiction")
public class BookNonFiction extends Book {
    @Column(name = "Subject")
    private BookSubjectNF bookSubjectNF;

    public BookNonFiction () {
    }

    public BookSubjectNF getBookSubjectNF() {
        return bookSubjectNF;
    }

    public void setBookSubjectNF(BookSubjectNF bookSubjectNF) {
        this.bookSubjectNF = bookSubjectNF;
    }
}
