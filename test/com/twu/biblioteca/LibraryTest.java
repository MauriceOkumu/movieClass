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
        assertEquals(library.listOfMovies.size(), 9);
    }
    @Test
    public void lookTitle() {
        assertEquals(library.listOfMovies.get(7).getYear(), 2010);
    }
    @Test
    public void checkStars() {
        assertEquals(library.listOfMovies.get(7).getRating(),"10 stars");
    }
    @Test
    public void checkAnotherStar() {
        assertEquals(library.listOfMovies.get(6).getRating(),"3 stars");
    }
}
