package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.ArticleService;
import com.realdolmen.shopr.service.OrderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
    @InjectMocks
    OrderController orderController;

    @Mock
    OrderService orderService;

    @Mock
    ArticleService articleService;

    Order currentOrder;
    OrderLine newOrderLine;
    OrderLine orderLine2;
    User user;
    Article article;
    Article article2;

    @Before
    public void init(){
        user = new User();
        newOrderLine = new OrderLine();
        orderLine2 = new OrderLine();
        article = new Article();
        article2 = new Article();

        user.setName("Janssen");
        user.setFirstName("Jan");
        user.setId(1);

        article.setId(1);
        article.setPrice(10);
        article.setTitle("TestArtikel");
        article.setSupplierId("5");

        article.setId(1);
        article.setPrice(10);
        article.setTitle("TestArtikel");
        article.setSupplierId("5");

        newOrderLine.setAmount(2);

    }

    @Test
    public void testAddOrderLineShouldHaveOneOrderLineAfterFirstAdd(){
        when(articleService.findById(1)).thenReturn(article);
        this.orderController.addOrderLine(1);
        Assert.assertEquals(1, orderController.currentOrder.getOrderLines().size());
    }

    @Test
    public void testAddOrderLineTwoTimeTheSameArticleShouldSetOnlyOneOrderLine(){
        when(articleService.findById(1)).thenReturn(article);
        this.orderController.addOrderLine(1);
        this.orderController.addOrderLine(1);
        Assert.assertEquals(1, orderController.currentOrder.getOrderLines().size());
    }

    @Test
    public void testAddOrderLineTwoTimeTheSameArticleShouldAddAmounts(){
        when(articleService.findById(1)).thenReturn(article);
        this.orderController.addOrderLine(1);
        this.orderController.addOrderLine(1);
        Assert.assertEquals(4, orderController.currentOrder.getOrderLines().get(0).getAmount());
    }






}
