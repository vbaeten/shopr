package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.service.ArticleService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class ArticleControllerTest {
    @InjectMocks
    ArticleController articleController;

    @Mock
    ArticleService articleService;

    private Lp lp = new Lp();
    private Game game = new Game();
    private Fiction fiction = new Fiction();
    private NonFiction nonFiction = new NonFiction();

    @Before
    public void init(){
        lp.setTypes("LP");
        game.setTypes("GAME");
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
}
