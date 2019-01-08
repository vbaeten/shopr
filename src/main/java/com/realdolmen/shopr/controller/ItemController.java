package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.service.ItemService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class ItemController {

    @Inject
    private ItemService itemService;


    private int id;

    public List<Item> getItems(){

        return this.itemService.findAllItems();
    }

    public ItemService getItemService() {
        return itemService;
    }

    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
