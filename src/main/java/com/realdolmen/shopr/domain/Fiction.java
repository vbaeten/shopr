package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "fiction")
@NamedQueries(
        @NamedQuery(
                name = Fiction.FIND_ALL,
                query = "SELECT a FROM Fiction a"
        )
)
public class Fiction extends Book implements Serializable {

    public static final String FIND_ALL = "Fiction.findAll";

    @Column(name = "genre")
    private BookGenre bookGenre;

    @Size(max = 255)
    @Column(name = "synopsis")
    private String synopsis;

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
