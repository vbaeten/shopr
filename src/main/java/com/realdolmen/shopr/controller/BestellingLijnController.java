package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.Bestelling;
import com.realdolmen.shopr.domain.BestellingLijn;
import com.realdolmen.shopr.service.ArtikelService;
import com.realdolmen.shopr.service.BestellingLijnService;
import org.omnifaces.cdi.Param;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@ManagedBean
@SessionScoped
public class BestellingLijnController {

    @Inject
    private BestellingLijnService bestellingLijnService;

    private ArtikelService artikelService;

    private BestellingLijn bestellingLijn = new BestellingLijn();

//    @ManagedProperty(value = "#{param.id}")
//    private int selectedBestellingId;

    public String submitQuantity(int artikelId){
        this.bestellingLijn.setArtikel(artikelService.findArtikelById(artikelId));
//        this.bestellingLijn.setQuantity(quantity);
        return "shoppingCart?faces-redirect=true";
//        if (bestelling == null){
//            Bestelling nieuweBestelling = new Bestelling();
//            this.bestellingLijn.setBestelling(nieuweBestelling);
//        }else {
//            this.bestellingLijn.setBestelling(bestelling);
//        }
//        this.bestellingLijn.setSubTotal(artikel.getPrijs().multiply(quantity) );
    }


    public BestellingLijn findById(int id) {
        return bestellingLijnService.findBestellingLijnById(id);
    }

    public List<BestellingLijn> findAll() {
        return bestellingLijnService.findAllBestellingLijnen();
    }

    public List <BestellingLijn> findByBestellingId(int id) {
        return bestellingLijnService.findBestellingLijnenByBestellingId(id);
    }

    public void insert(BestellingLijn bestellingLijn) {
        bestellingLijnService.insert(bestellingLijn);
    }


    public void removeById(int id) {
        bestellingLijnService.removeBestellingLijnById(id);
    }




//    public int getSelectedBestellingId() {
//        return selectedBestellingId;
//    }

//    public void setSelectedBestellingId(int selectedBestellingId) {
//        this.selectedBestellingId = selectedBestellingId;
//    }

    public BestellingLijn getBestellingLijn() {
        return bestellingLijn;
    }

    public void setBestellingLijn(BestellingLijn bestellingLijn) {
        this.bestellingLijn = bestellingLijn;
    }
}
