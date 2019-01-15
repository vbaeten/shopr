package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.repository.ItemRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@Stateless
public class ItemService implements Serializable {

    @Inject
    private ItemRepository itemRepository = new ItemRepository();


    public List<Item> findAllItems() {

        return this.itemRepository.findAllItems();
    }

    public Item getById(int id) {
        return this.itemRepository.findById(id);
    }
}
