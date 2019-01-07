package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Boek;
import com.realdolmen.shopr.repository.BoekRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class BoekService
{
    @Inject
    BoekRepository boekRepository;

    public List<Boek> findAllBooks()
    {
        return boekRepository.findAllBooks();
    }

    public void update(Boek boek)
    {
        boekRepository.update(boek);
    }

    public void delete(int id)
    {
        Boek boek = boekRepository.findById(id);
        boekRepository.delete(boek);
    }


}
