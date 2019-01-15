package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.domain.enums.BookGenre;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("fiction")
@Data
public class BookFiction extends Book {
    @Column
    @Enumerated(EnumType.STRING)
    private BookGenre bookGenre;
    @Column
    @Size(max = 255 )
    private String summary;

}
