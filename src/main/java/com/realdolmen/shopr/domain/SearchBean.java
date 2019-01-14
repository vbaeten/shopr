package com.realdolmen.shopr.domain;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.io.Serializable;

@Named
@RequestScoped
@NamedQueries(
        {

        })
public class SearchBean implements Serializable {
    private String searchTitle = new String();
    private int searchId;
    private int searchMinPrice;
    private int searchMaxPrice;

    @Inject
    SearchBeanService searchBeanService;

    @PostConstruct
    public void init(){
        searchMinPrice = searchBeanService.findMinPrice();
        searchMaxPrice = searchBeanService.findMaxPrice();
    }

    public String getSearchTitle() {
        return searchTitle;
    }

    public void setSearchTitle(String searchTitle) {
        this.searchTitle = searchTitle;
    }

    public int getSearchId() {
        return searchId;
    }

    public void setSearchId(int searchId) {
        this.searchId = searchId;
    }

    public int getSearchMinPrice() {
        return searchMinPrice;
    }

    public void setSearchMinPrice(int searchMinPrice) {
        this.searchMinPrice = searchMinPrice;
    }

    public int getSearchMaxPrice() {
        return searchMaxPrice;
    }

    public void setSearchMaxPrice(int searchMaxPrice) {
        this.searchMaxPrice = searchMaxPrice;
    }
}
