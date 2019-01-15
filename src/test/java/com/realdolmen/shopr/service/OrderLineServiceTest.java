package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.enums.GameGenre;
import com.realdolmen.shopr.repository.GameRepository;
import com.realdolmen.shopr.repository.OrderLineRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class OrderLineServiceTest {
    @Mock
    OrderLineRepository orderLineRepository;
    @Mock
    GameRepository gameRepository;

    @InjectMocks
    OrderLineService orderLineService;

    List<OrderLine> orderLineList;
    OrderLine orderLine1;
    OrderLine orderLine2;

    @Before
    public void init() {
        orderLineList = new ArrayList<>();


        //  OrderLine 1
        orderLine1 = new OrderLine();
        orderLine1.setQuantity(new BigDecimal(5));
        orderLine1.setSubTotal(BigDecimal.valueOf(50));
        Game singstar = new Game();
        singstar.setTitle("singstar");
        singstar.setPrice(BigDecimal.valueOf(10));
        singstar.setSupplierId("supplierid");
        singstar.setType("game");
        singstar.setMinimumAge(8L);
        singstar.setPublisher("publisher");
        singstar.setGameGenre(GameGenre.MMORPG);


        //  OrderLine 2
        orderLine2 = new OrderLine();
        orderLine2.setQuantity(new BigDecimal(1));
        orderLine2.setSubTotal(BigDecimal.valueOf(20));
        Game csgo = new Game();
        csgo.setTitle("csgo");
        csgo.setPrice(BigDecimal.valueOf(20));
        csgo.setSupplierId("supplierid");
        csgo.setType("game");
        csgo.setMinimumAge(8L);
        csgo.setPublisher("publisher");
        csgo.setGameGenre(GameGenre.MMORPG);

        orderLineList.add(orderLine1);
        orderLineList.add(orderLine2);
    }

    @Test
    public void testCalculateSubtotalIsCorrect() {
        BigDecimal price = new BigDecimal(5);
        BigDecimal quantity = new BigDecimal(10);
        BigDecimal subtotal = orderLineService.calculateSubtotal(price, quantity);
        assertEquals("subtotal should be 50", BigDecimal.valueOf(50), subtotal);
    }

    @Test
    public void testCalculateTotalPriceIsCorrect() {
        BigDecimal totalprice = orderLineService.calculateTotalPrice(orderLineList);
        assertEquals("total price should be 70", BigDecimal.valueOf(70.00).setScale(2, RoundingMode.HALF_EVEN), totalprice);
    }


    @Test
    public void testOrderLineRepositoryFindAll() {
        when(orderLineRepository.findAll()).thenReturn(this.orderLineList);
        assertEquals("size should be 2", 2, orderLineList.size());
    }

    @Test
    public void testOrderLineRepositoryRemove() {
        doNothing().when(orderLineRepository).remove(orderLine1);
        orderLineRepository.remove(orderLine1);
        verify(orderLineRepository, times(1)).remove(orderLine1);
    }

    @Test
    public void testOrderLineRepositoryInsert() {
        when(orderLineRepository.insert(orderLine1)).thenReturn(orderLine1);
        orderLineService.insert(orderLine1);
        verify(orderLineRepository, times(1)).insert(orderLine1);
    }

    @Test
    public void testOrderLineRepositoryFindById() {
        Long primaryKey = 1L;
        when(orderLineRepository.findByPrimaryKey(primaryKey)).thenReturn(orderLine1);
        OrderLine orderLineById = orderLineService.findByPrimaryKey(primaryKey);
        assertEquals("orderLineById is orderLine1", orderLine1, orderLineById);
    }

    @Test
    public void testOrderLineRepositoryUpdate() {
        when(orderLineRepository.findByPrimaryKey(1L)).thenReturn(orderLine1);
        orderLineService.update(orderLine1);
        verify(orderLineRepository, times(1)).update(orderLine1);
    }
}