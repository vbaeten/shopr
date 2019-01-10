package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.ArtikelLijnInBestelling;
import com.realdolmen.shopr.domain.Bestelling;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.BestellingsRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Calendar;
import java.util.List;

@Stateless
public class BestellingsService
{
@Inject
    BestellingsRepository bestellingsRepository;

    public void bestellingAanmaken(List<ArtikelLijnInBestelling> artikelLijnInBestellings, User u)
    {
        Bestelling bestelling = new Bestelling();
        bestelling.setUser(u);
        bestelling.setBestelDatum(Calendar.getInstance());

        for (ArtikelLijnInBestelling a : artikelLijnInBestellings)
        {
            bestelling.addArtikel(a.getArtikel());

        }
        bestellingsRepository.insert(bestelling);


    }

}
