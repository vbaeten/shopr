package com.realdolmen.shopr.domain;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ArticleOrder {

    @ManyToOne
    @JoinColumn
    private Article article;

    @ManyToOne
    @JoinColumn
    private Order order;

}
