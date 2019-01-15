package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.domain.SearchBean;
import com.realdolmen.shopr.service.SearchBeanService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SearchBeanTest {
    @InjectMocks
    SearchBean searchBean;

    @Mock
    SearchBeanService searchBeanService;

    private List<Article> searchResults = new ArrayList<>();

    private Lp fetchedLp = new Lp();
    private Game fetchedGame = new Game();



    @Before
    public void init(){
        searchBean.setSearchId(1);
        searchBean.setSearchMinPrice(5);
        searchBean.setSearchMaxPrice(50);
        searchBean.setSearchTitle("TestTitel");

        searchResults.add(fetchedLp);
        searchResults.add(fetchedGame);
    }

    @Test
    public void testClear(){
        when(searchBeanService.findMinPrice()).thenReturn(4);
        when(searchBeanService.findMaxPrice()).thenReturn(60);
        searchBean.clear();
        Assert.assertEquals(0, searchBean.getSearchId());
        Assert.assertEquals(4, searchBean.getSearchMinPrice());
        Assert.assertEquals(60, searchBean.getSearchMaxPrice());
        Assert.assertEquals("", searchBean.getSearchTitle());
    }

    @Test
    public void testSearch(){
        when(searchBeanService.search(any())).thenReturn(searchResults);
        searchBean.search();
        Assert.assertEquals(2, searchResults.size());
        verify(searchBeanService, times(1)).search(any());
    }



}
