package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.repository.CriteriaRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CriteriaServiceTest {
    @Mock
    private CriteriaRepository criteriaRepository;
    @InjectMocks
    private CriteriaService criteriaService;

    private Lp lp = new Lp();
    private Lp lp1 = new Lp();
    private Game game = new Game();
    private Game game1= new Game();

    @Before
    public void init() {
        when(criteriaRepository.findByCriteria(Lp.class)).thenReturn(Arrays.asList(lp,lp1));
        when(criteriaRepository.findByCriteria(Game.class)).thenReturn(Arrays.asList(game,game1));
    }

    @Test
    public void testFindsCorrectAmountWhenSearchingForEntitiesByCriteria() {
        List<Class> entities = new ArrayList<>();
        entities.add(Lp.class);
        entities.add(Game.class);
        List search = criteriaService.findByCriteria(entities);
        Assert.assertEquals(4,search.size());
    }
}