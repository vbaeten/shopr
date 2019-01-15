package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.service.ArticleService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ArticleControllerTest {
    @InjectMocks
    ArticleController articleController;

    @Mock
    ArticleService articleService;

    private Lp lp = new Lp();
    private Game game = new Game();
    private Fiction fiction = new Fiction();
    private NonFiction nonFiction = new NonFiction();
    private Article article = new Article();

    @Before
    public void init(){

    }

    @Test
    public void testNavigateToDetailsPageLp(){
        String result = articleController.navigateToDetailPage(lp);
        Assert.assertEquals("lpDetail.xhtml", result);
    }

    @Test
    public void testNavigateToDetailsPageGame(){
        String result = articleController.navigateToDetailPage(game);
        Assert.assertEquals("gameDetail.xhtml", result);
    }

    @Test
    public void testNavigateToDetailsPageFiction(){
        String result = articleController.navigateToDetailPage(fiction);
        Assert.assertEquals("fictionDetail.xhtml", result);
    }

    @Test
    public void testNavigateToDetailsPageNonFiction(){
        String result = articleController.navigateToDetailPage(nonFiction);
        Assert.assertEquals("nonFictionDetail.xhtml", result);
    }

    @Test
    public void testNavigateToDetailsPageNotFound(){
        String result = articleController.navigateToDetailPage(article);
        Assert.assertEquals("pageNotFound.xhtml", result);
    }


}
