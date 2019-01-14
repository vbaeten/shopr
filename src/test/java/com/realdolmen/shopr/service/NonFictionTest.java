package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.repository.NonFictionRepository;
import com.realdolmen.shopr.repository.RatingRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class NonFictionTest {
    @InjectMocks
    NonFictionService nonFictionService;

    @Mock
    NonFictionRepository nonFictionRepository;

    @Mock
    RatingRepository ratingRepository;

    NonFiction nonFiction;
    NonFiction nonFiction2;

    @Before
    public void init(){
        nonFiction = new NonFiction();
        nonFiction.setId(1);
        nonFiction2 = new NonFiction();
        nonFiction2.setId(2);
    }

    @Test
    public void testInsert(){
        doNothing().when(nonFictionRepository).insert(nonFiction);
        nonFictionService.insert(nonFiction);
        verify(nonFictionRepository, times(1)).insert(nonFiction);
    }

    @Test
    public void testDelete(){
        doNothing().when(nonFictionRepository).delete(1);
        nonFictionService.delete(nonFiction);
        verify(nonFictionRepository, times(1)).delete(1);
    }

    @Test
    public void testFindNonFictionById(){
        when(nonFictionRepository.findById(1)).thenReturn(nonFiction);
        NonFiction checkedFiction = nonFictionService.findNonFictionById(1);
        assertEquals(checkedFiction, nonFiction);
    }

    @Test
    public void testUpdate(){
        when(nonFictionRepository.findById(1)).thenReturn(nonFiction);
        nonFictionService.update(nonFiction);
        verify(nonFictionRepository, times(1)).update(nonFiction);
    }

    @Test
    public void testFindAllNonFictions(){
        when(nonFictionRepository.findAll()).thenReturn(Arrays.asList(nonFiction, nonFiction2));
        List<NonFiction> expectedFictionList = nonFictionService.findAllNonFictions();
        Assert.assertEquals(expectedFictionList, Arrays.asList(nonFiction, nonFiction2));
    }

}
