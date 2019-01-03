package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.service.ItemService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class ItemsController {
    @Inject
    private ItemService itemService;

    public List<Item> getItems() {
        return this.itemService.findAllItems();
    }
}
