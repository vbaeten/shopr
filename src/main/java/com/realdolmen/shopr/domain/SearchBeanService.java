package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.repository.SearchBeanRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;

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



}
