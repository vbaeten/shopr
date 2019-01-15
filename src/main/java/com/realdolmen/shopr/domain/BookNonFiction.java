package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.domain.enums.BookSubjectNF;

import javax.persistence.*;

@Entity
@DiscriminatorValue("nonfiction")
public class BookNonFiction extends Book {
    @Column
    @Enumerated(EnumType.STRING)
    private BookSubjectNF bookSubjectNF;

    public BookSubjectNF getBookSubjectNF() {
        return bookSubjectNF;
    }

    public void setBookSubjectNF(BookSubjectNF bookSubjectNF) {
        this.bookSubjectNF = bookSubjectNF;
    }
}
