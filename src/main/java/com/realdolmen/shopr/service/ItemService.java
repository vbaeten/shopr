package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.repository.ItemRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ItemService {
    @Inject
    private ItemRepository itemRepository;

    public Item findItemById(Long id) {
        return itemRepository.findById(id);
    }

    public List<Item> findAllItems() {
        return itemRepository.findAll();
    }
}
