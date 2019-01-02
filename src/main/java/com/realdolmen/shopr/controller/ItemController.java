package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.service.ItemService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import java.util.List;

@ManagedBean
@ViewScoped
public class ItemController {

    private Item newItem = new Item();


    @Inject
    private ItemService itemService;


    public List<Item> getItems(){

        return this.itemService.findAllItems();
    }


    public Item getNewItem() {
        return newItem;
    }

    public void setNewItem(Item newItem) {
        this.newItem = newItem;
    }


    public String redirect(String type) {

        switch (type){

            case "fiction":
                return "/detail-pages/fiction-detail.xhtml";

            case "nonFiction":
                return"/detail-pages/nonFiction-detail.xhtml";

            case "game":
              return "/detail-pages/games-detail.xhtml";

            case "lp":
               return "/detail-pages/lps-detail.xhtml";


        }return "items-overview.xhtml";
    }
}
