package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.domain.enums.BookSubjectNF;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("nonfiction")
public class BookNonFiction extends Book {
    @Column
    @Enumerated(EnumType.STRING)
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
