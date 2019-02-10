package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    @Before
    public void initializeClass() throws Exception {
       library = new Library();
       library.initiate();
    }
    @Test
    public void listBooksTest() {
        assertEquals(library.getMovie().size(), 9);
    }
    @Test
    public void lookTitle() {
        assertEquals(library.getMovie().get(0).getYear(), 2009);
    }
    @Test
    public void checkStars() {
        assertEquals(library.getMovie().get(7).getRating(),"6 stars");
    }
    @Test
    public void checkAnotherStar() {
        assertEquals(library.getMovie().get(6).getRating(),"10 stars");
    }
}
