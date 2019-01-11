package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.Lp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import javax.persistence.EntityManager;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ArticleServiceTest {

    @InjectMocks
    ArticleService articleService;

    @Mock
    private EntityManager em;


    @Before
    public void initializeService(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShouldPersistArticle(){
        Article lp = new Lp();
        articleService.insert(lp);
        verify(em, times(1)).persist(lp);
    }

}
