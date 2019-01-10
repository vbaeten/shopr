package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.repository.NonFictionRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class NonFictionServiceTest {


    @InjectMocks
    private NonFictionService nonFictionService;
    @Mock
    private NonFictionRepository nonFictionRepository;

    private NonFiction nonFiction;
    private NonFiction nonFiction2;
    private int id;
    private List<NonFiction> nonFictions = new ArrayList<>();


    @Before
    public void init(){
        nonFiction=new NonFiction();
        nonFiction2=new NonFiction();
        id=1;
        nonFictions.add(nonFiction);
        nonFictions.add(nonFiction2);
    }

    @Test
    public void insert() {

        nonFictionService.insert(nonFiction);
        verify(nonFictionRepository,times(1)).insert(nonFiction);
    }

    @Test
    public void findAllNonFictions() {

        when(nonFictionRepository.findAllNonFictions()).thenReturn(nonFictions);
        List<NonFiction> resultList = nonFictionService.findAllNonFictions();
        assertEquals(resultList,nonFictions);
        verify(nonFictionRepository,times(1)).findAllNonFictions();
    }

    @Test
    public void findById() {

        when(nonFictionRepository.findById(id)).thenReturn(nonFiction);
        NonFiction result = nonFictionService.findById(id);
        assertEquals(result,nonFiction);
        verify(nonFictionRepository,times(1)).findById(id);

    }

    @Test
    public void delete() {

        nonFictionService.delete(nonFiction);
        verify(nonFictionRepository,times(1)).delete(nonFiction);
    }

    @Test
    public void update() {

        nonFictionService.update(nonFiction);
        verify(nonFictionRepository,times(1)).update(nonFiction);
    }
}