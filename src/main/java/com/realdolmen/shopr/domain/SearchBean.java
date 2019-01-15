package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.service.SearchBeanService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named
@SessionScoped
public class SearchBean implements Serializable {
    private Map<String, String> searchParameters = new HashMap<>();

    private String searchTitle = new String();
    private int searchId;
    private int searchMinPrice;
    private int searchMaxPrice;

    private List<Article> searchResults = new ArrayList<>();

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

    public void search(){
        searchParameters.put("id", String.valueOf(searchId));
        searchParameters.put("title", searchTitle);
        searchParameters.put("min", String.valueOf(searchMinPrice));
        searchParameters.put("max", String.valueOf(searchMaxPrice));

        searchResults = searchBeanService.search(searchParameters);
    }

    public void clear(){
        searchMinPrice = searchBeanService.findMinPrice();
        searchMaxPrice = searchBeanService.findMaxPrice();
        searchId = 0;
        searchTitle = "";
        searchResults = new ArrayList<>();
    }

    public List<Article> getSearchResults() {
        return searchResults;
    }
}
