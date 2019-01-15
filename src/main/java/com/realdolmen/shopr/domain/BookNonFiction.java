package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.domain.enums.BookSubjectNF;
import lombok.Data;

import javax.persistence.*;

@Entity
@DiscriminatorValue("nonfiction")
@Data
public class BookNonFiction extends Book {
    @Column
    @Enumerated(EnumType.STRING)
    private BookSubjectNF bookSubjectNF;
}
