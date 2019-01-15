package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.BestellingsRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
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

    public List<Bestelling> bestellingenUser(int id)
    {
        return bestellingsRepository.findByUser(id);
    }

    public Bestelling findById(int id)
    {
        return bestellingsRepository.findById(id);
    }

    public Calendar datumBestelling(Bestelling b)
    {
        return b.getBestelDatum();
    }

    public List<ArtikelLijnInBestelling> artikelLijnInBestellingList(Bestelling bestelling)
    {
        List<ArtikelLijnInBestelling> artikels = new ArrayList<>();

        Lp lp = new Lp();
        Game game = new Game();
        Fictie fictie = new Fictie();
        NonFictie nonFictie = new NonFictie();

        ArtikelLijnInBestelling artikelLijnInBestellingLP = new ArtikelLijnInBestelling();
        ArtikelLijnInBestelling artikelLijnInBestellingGame = new ArtikelLijnInBestelling();
        ArtikelLijnInBestelling artikelLijnInBestellingFictie = new ArtikelLijnInBestelling();
        ArtikelLijnInBestelling artikelLijnInBestellingNonFictie = new ArtikelLijnInBestelling();
        int aantal = 1;
        for (Artikel a : bestelling.getArtikels()  )
        {

            switch (a.getType())
            {
                case "lp":

                    artikelLijnInBestellingLP.setArtikel(a);
                    artikelLijnInBestellingLP.setAantal(aantal);
                    artikelLijnInBestellingLP.setTotaalBedragLijn(a.getPrijs()* artikelLijnInBestellingLP.getAantal());
                    break;
                case "game":

                    artikelLijnInBestellingGame.setArtikel(a);
                    artikelLijnInBestellingGame.setAantal(aantal);
                    artikelLijnInBestellingGame.setTotaalBedragLijn(a.getPrijs()* artikelLijnInBestellingGame.getAantal());
                    break;
                case "fictie":

                    artikelLijnInBestellingFictie.setArtikel(a);
                    artikelLijnInBestellingFictie.setAantal(aantal);
                    artikelLijnInBestellingFictie.setTotaalBedragLijn(a.getPrijs()* artikelLijnInBestellingFictie.getAantal());
                    break;
                case "nonFictie":

                    artikelLijnInBestellingNonFictie.setArtikel(a);
                    artikelLijnInBestellingNonFictie.setAantal(aantal);
                    artikelLijnInBestellingNonFictie.setTotaalBedragLijn(a.getPrijs()* artikelLijnInBestellingFictie.getAantal());
                    break;
            }
        }

        artikels.add(artikelLijnInBestellingLP);
        artikels.add(artikelLijnInBestellingGame);
        artikels.add(artikelLijnInBestellingFictie);
        artikels.add(artikelLijnInBestellingNonFictie);

        return artikels;
    }

    public List<Bestelling> bestellingenGeladenMetArtikels(int id)
    {
        return bestellingsRepository.bestellingenJoinFetch(id);
    }





}
