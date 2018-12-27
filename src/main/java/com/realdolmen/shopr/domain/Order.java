package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name= "ArticleOrder")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "Date")
    private Timestamp date;

//    @Column
//    @OneToMany
//    private List<Article> articles;





//    @Column
//    @ManyToMany
//    private Article article;


}
