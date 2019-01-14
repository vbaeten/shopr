package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Rating;
import com.realdolmen.shopr.repository.RatingRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class RatingServiceTest {
    @InjectMocks
    RatingService ratingService;

    @Mock
    RatingRepository ratingRepository;

    private Rating rating;
    private Rating rating2;
    private Article article;
    private List<Rating> ratingsList = new ArrayList<>();

    @Before
    public void init(){
        rating = new Rating();
        rating2 = new Rating();
        article = new Article();

        rating.setId(1);
        rating2.setId(2);

        rating.setScore(5);
        rating2.setScore(8);


        article.setId(1);


        ratingsList.add(rating);
        ratingsList.add(rating2);
    }

    @Test
    public void testFindById(){
        when(ratingRepository.findById(1)).thenReturn(rating);
        Rating checkedRating = ratingService.getRatingById(1);
        Assert.assertEquals(rating, checkedRating);
    }

    @Test
    public void testFindByArticleId(){
        when(ratingRepository.findByArticleId(1)).thenReturn(Arrays.asList(rating, rating2));
        List<Rating> checkedRatings = ratingService.getRatingsByArticleId(1);
        Optional<Rating> rating1 = checkedRatings.stream().filter(rating -> rating.getId() == 1).findAny();
        Assert.assertTrue(rating1.isPresent());
        Assert.assertEquals(5, rating1.get().getScore());
    }


    @Test
    public void testInsert(){
        ArgumentCaptor<Rating> captor = ArgumentCaptor.forClass(Rating.class);
        ratingService.insert(rating, 1);
        verify(ratingRepository, times(1)).insert(captor.capture(), eq(1));
        Assert.assertEquals(5, captor.getValue().getScore());
    }


}
