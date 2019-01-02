package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.repository.ItemRepository;

import javax.inject.Inject;
import java.util.List;

public class ItemService {

    @Inject
    private ItemRepository itemRepository = new ItemRepository();


    public List<Item> findAllItems() {

        return this.itemRepository.findAllItems();
    }
}
