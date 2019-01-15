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
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.faces.context.FacesContext;

import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(FacesContext.class)
public class OrderControllerTest {
    @InjectMocks
    OrderController orderController;

    @Mock
    OrderService orderService;

    @Mock
    UserController userController;

    @Mock
    ArticleService articleService;

    @Mock
    FacesContext facesContext;

    Order currentOrder;
    OrderLine newOrderLine;
    OrderLine newOrderLine2;
    User user;
    Article article;
    Article article2;

    @Before
    public void init(){
        user = new User();
        newOrderLine = new OrderLine();
        newOrderLine2 = new OrderLine();
        article = new Article();
        article2 = new Article();

        user.setName("Janssen");
        user.setFirstName("Jan");
        user.setId(1);

        article.setId(1);
        article.setPrice(10);
        article.setTitle("TestArtikel");
        article.setSupplierId("5");

        newOrderLine.setAmount(1);
        orderController.setNewOrderLine(newOrderLine);

        newOrderLine2.setAmount(2);
    }

    @Test
    public void testAddOrderLineShouldHaveOneOrderLineAfterFirstAdd(){
        PowerMockito.mockStatic(FacesContext.class);
        when(FacesContext.getCurrentInstance()).thenReturn(facesContext);
        when(articleService.findById(1)).thenReturn(article);
        this.orderController.addOrderLine(1);
        Assert.assertEquals(1, orderController.currentOrder.getOrderLines().size());
    }

    @Test
    public void testAddOrderLineTwoTimeTheSameArticleShouldSetOnlyOneOrderLine(){
        PowerMockito.mockStatic(FacesContext.class);
        when(FacesContext.getCurrentInstance()).thenReturn(facesContext);
        when(articleService.findById(1)).thenReturn(article);
        this.orderController.addOrderLine(1);
        orderController.setNewOrderLine(newOrderLine2);
        this.orderController.addOrderLine(1);
        Assert.assertEquals(1, orderController.currentOrder.getOrderLines().size());
        Assert.assertEquals(3, orderController.currentOrder.getOrderLines().get(0).getAmount());

    }

    @Test
    public void testeDeleteOrderLine(){
        PowerMockito.mockStatic(FacesContext.class);
        when(FacesContext.getCurrentInstance()).thenReturn(facesContext);
        when(articleService.findById(1)).thenReturn(article);
        this.orderController.addOrderLine(1);
        this.orderController.deleteOrderLine(newOrderLine);
        Assert.assertEquals(0, orderController.currentOrder.getOrderLines().size());

    }







}
