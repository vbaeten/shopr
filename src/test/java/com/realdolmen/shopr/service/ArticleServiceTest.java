package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.ArticleRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class ArticleServiceTest {
    @Mock
    ArticleRepository articleRepository;

    @InjectMocks
    ArticleService articleService;

    List<Article> articleList;
    Article article1;
    Article article2;

    @Before
    public void init() {
        articleList = new ArrayList<>();

        //  Article 1
        article1 = new Game();
        article1.setTitle("test");
        article1.setPrice(BigDecimal.valueOf(10));
        article1.setSupplierId("supplierid");
        article1.setType("article");


        //  Article 2
        article2 = new Game();
        article2.setTitle("test2");
        article2.setPrice(BigDecimal.valueOf(11));
        article2.setSupplierId("supplierid2");
        article2.setType("article2");


        articleList.add(article1);
        articleList.add(article2);
    }

    @Test
    public void testArticleRepositoryFindAll() {
        when(articleRepository.findAll()).thenReturn(this.articleList);
        assertEquals("size should be 2", 2, articleList.size());
        assertEquals("Title should be 'test'", "test", articleList.get(0).getTitle());
    }

    @Test
    public void testArticleRepositoryRemove() {
        doNothing().when(articleRepository).remove(article1);
        articleRepository.remove(article1);
        verify(articleRepository, times(1)).remove(article1);
    }

    @Test
    public void testArticleRepositoryInsert() {
        when(articleRepository.insert(article1)).thenReturn(article1);
        articleService.insert(article1);
        verify(articleRepository, times(1)).insert(article1);
    }

    @Test
    public void testArticleRepositoryFindById() {
        Long primaryKey = 1L;
        when(articleRepository.findByPrimaryKey(primaryKey)).thenReturn(article1);
        Article articleById = articleService.findByPrimaryKey(primaryKey);
        assertEquals("articleById is article1", article1, articleById);
    }

    @Test
    public void testArticleRepositoryUpdate() {
        when(articleRepository.findByPrimaryKey(1L)).thenReturn(article1);
        articleService.update(article1);
        verify(articleRepository, times(1)).update(article1);
    }
}
