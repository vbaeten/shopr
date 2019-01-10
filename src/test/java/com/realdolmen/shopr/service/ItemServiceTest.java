package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.repository.ItemRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;


@RunWith(MockitoJUnitRunner.class)
public class ItemServiceTest {

    @Mock
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemService itemService;

    private Item item;

    @Before
    public void setup(){
        item= mock(Fiction.class);
    }



    @Test
    public void testFindAll(){
        List items = new LinkedList();
        items.add(new Fiction());
        items.add(new LP());

        List result = itemService.findAllItems();


    }



}
