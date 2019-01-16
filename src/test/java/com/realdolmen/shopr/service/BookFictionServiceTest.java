package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.enums.BookGenre;
import com.realdolmen.shopr.repository.BookFictionRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class BookFictionServiceTest {
    @Mock
    BookFictionRepository bookFictionRepository;

    @InjectMocks
    BookFictionService bookFictionService;

    List<BookFiction> bookFictionList;
    BookFiction bookFiction1;
    BookFiction bookFiction2;

    @Before
    public void init() {
        bookFictionList = new ArrayList<>();

        //  BookFiction 1
        bookFiction1 = new BookFiction();
        bookFiction1.setTitle("test");
        bookFiction1.setPrice(BigDecimal.valueOf(10));
        bookFiction1.setSupplierId("supplierid");
        bookFiction1.setType("bookFiction");
        bookFiction1.setAuthor("author");
        bookFiction1.setIsbn("978-02-4126-554-7");
        bookFiction1.setNumberOfPages(896);
        bookFiction1.setBookGenre(BookGenre.FANTASY);
        bookFiction1.setSummary("ogizjmefjizemo");

        //  BookFiction 2
        bookFiction2 = new BookFiction();
        bookFiction2.setTitle("test2");
        bookFiction2.setPrice(BigDecimal.valueOf(11));
        bookFiction2.setSupplierId("supplierid2");
        bookFiction2.setType("bookFiction2");

        bookFictionList.add(bookFiction1);
        bookFictionList.add(bookFiction2);
    }

    @Test
    public void testBookFictionRepositoryFindAll() {
        when(bookFictionRepository.findAll()).thenReturn(Arrays.asList(bookFiction1, bookFiction2));
        List<BookFiction> bookFictionListExpected = bookFictionService.findAll();
        assertEquals("BookListExpected should be BookFictionList", bookFictionListExpected, bookFictionList);
        assertEquals("size should be 2", 2, bookFictionList.size());
        assertEquals("Title should be 'test'", "test", bookFictionList.get(0).getTitle());
    }

    @Test
    public void testBookFictionRepositoryRemove() {
        doNothing().when(bookFictionRepository).remove(bookFiction1);
        bookFictionRepository.remove(bookFiction1);
        verify(bookFictionRepository, times(1)).remove(bookFiction1);
    }

    @Test
    public void testBookFictionRepositoryFindById() {
        Long primaryKey = 1L;
        when(bookFictionRepository.findByPrimaryKey(primaryKey)).thenReturn(bookFiction1);
        BookFiction bookFictionById = bookFictionService.findByPrimaryKey(primaryKey);
        assertEquals("bookFictionById is bookFiction1", bookFiction1, bookFictionById);
    }

    @Test
    public void testBookFictionRepositoryUpdate() {
        when(bookFictionRepository.findByPrimaryKey(1L)).thenReturn(bookFiction1);
        bookFictionService.update(bookFiction1);
        verify(bookFictionRepository, times(1)).update(bookFiction1);
    }
}