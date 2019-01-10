package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.repository.ItemRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class ItemServiceTest {


    @InjectMocks
    private ItemService itemService;
    @Mock
    private ItemRepository itemRepository;

    private Item item;
    private Item item2;
    private List<Item> items = new ArrayList<>();


    @Before
    public void init(){


        item= new Game();
        item2= new LP();
        items.add(item);
        items.add(item2);
    }



    @Test
    public void testFindAll(){

        when(itemRepository.findAllItems()).thenReturn(items);
        List<Item> resultList = itemService.findAllItems();
        Assert.assertEquals(resultList,items);
        verify(itemRepository,times(1)).findAllItems();

    }



}
