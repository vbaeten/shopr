package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.domain.enums.BookGenre;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("Fiction")
public class BookFiction extends Book {
    @Column(name = "Bookgenre")
    private BookGenre bookGenre;
    @Column(name = "Summary")
    @Size(max = 255 )
    private String summary;

    public BookFiction() {
    }

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
