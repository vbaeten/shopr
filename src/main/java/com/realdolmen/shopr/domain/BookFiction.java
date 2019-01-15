package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.domain.enums.BookGenre;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("fiction")
public class BookFiction extends Book {
    @Column
    @Enumerated(EnumType.STRING)
    private BookGenre bookGenre;
    @Column
    @Size(max = 255 )
    private String summary;

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
