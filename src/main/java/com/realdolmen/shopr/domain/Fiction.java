package com.realdolmen.shopr.domain;


import javax.persistence.*;


@Entity
@Table(name = "fiction")
@DiscriminatorValue("fiction")
@NamedQueries({
        @NamedQuery(
                name = Fiction.FIND_ALL,
                query = "SELECT f FROM Fiction f"
        )
})
public class Fiction extends Book {


    @Enumerated(EnumType.STRING)
    private BookGenre bookGenre;

    public static final String FIND_ALL = "Fiction.findAll";
    private String preview;


    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }
}
