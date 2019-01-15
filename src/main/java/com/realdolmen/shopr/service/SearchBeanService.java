package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.repository.SearchBeanRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Stateless
public class SearchBeanService implements Serializable {
    @Inject
    SearchBeanRepository searchBeanRepository;

    public int findMinPrice(){
        return (int) Math.floor(searchBeanRepository.findMinPrice());
    }

    public int findMaxPrice(){
        return (int) Math.ceil(searchBeanRepository.findMaxPrice());
    }

    public List<Article> search(Map<String, String> searchParameters){
        return searchBeanRepository.dynamicQuerySearch(searchParameters);
    }



}
