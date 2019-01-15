package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.BookNonFiction;
import com.realdolmen.shopr.domain.enums.BookSubjectNF;
import com.realdolmen.shopr.repository.BookNonFictionRepository;
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
public class BookNonFictionServiceTest {
    @Mock
    BookNonFictionRepository bookNonFictionRepository;

    @InjectMocks
    BookNonFictionService bookNonFictionService;

    List<BookNonFiction> bookNonFictionList;
    BookNonFiction bookNonFiction1;
    BookNonFiction bookNonFiction2;

    @Before
    public void init() {
        bookNonFictionList = new ArrayList<>();

        //  BookNonFiction 1
        bookNonFiction1 = new BookNonFiction();
        bookNonFiction1.setTitle("test");
        bookNonFiction1.setPrice(BigDecimal.valueOf(10));
        bookNonFiction1.setSupplierId("supplierid");
        bookNonFiction1.setAuthor("autor");
        bookNonFiction1.setIsbn("978-02-4126-554-3");
        bookNonFiction1.setNumberOfPages(458);
        bookNonFiction1.setType("bookNonFiction");
        bookNonFiction1.setBookSubjectNF(BookSubjectNF.BIOGRAPHY);

        //  BookNonFiction 2
        bookNonFiction2 = new BookNonFiction();
        bookNonFiction2.setTitle("test2");
        bookNonFiction2.setPrice(BigDecimal.valueOf(11));
        bookNonFiction2.setSupplierId("supplierid2");
        bookNonFiction2.setType("bookNonFiction2");

        bookNonFictionList.add(bookNonFiction1);
        bookNonFictionList.add(bookNonFiction2);
    }

    @Test
    public void testBookNonFictionRepositoryFindAll() {
        when(bookNonFictionRepository.findAll()).thenReturn(this.bookNonFictionList);
        assertEquals("size should be 2", 2, bookNonFictionList.size());
        assertEquals("Title should be 'test'", "test", bookNonFictionList.get(0).getTitle());
    }

    @Test
    public void testBookNonFictionRepositoryRemove() {
        doNothing().when(bookNonFictionRepository).remove(bookNonFiction1);
        bookNonFictionRepository.remove(bookNonFiction1);
        verify(bookNonFictionRepository, times(1)).remove(bookNonFiction1);
    }

    @Test
    public void testBookNonFictionRepositoryFindById() {
        Long primaryKey = 1L;
        when(bookNonFictionRepository.findByPrimaryKey(primaryKey)).thenReturn(bookNonFiction1);
        BookNonFiction bookNonFictionById = bookNonFictionService.findByPrimaryKey(primaryKey);
        assertEquals("bookNonFictionById is bookNonFiction1", bookNonFiction1, bookNonFictionById);
    }

    @Test
    public void testBookNonFictionRepositoryUpdate() {
        when(bookNonFictionRepository.findByPrimaryKey(1L)).thenReturn(bookNonFiction1);
        bookNonFictionService.update(bookNonFiction1);
        verify(bookNonFictionRepository, times(1)).update(bookNonFiction1);
    }

}