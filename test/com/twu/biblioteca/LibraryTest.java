package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    @Before
    public void initializeClass() throws Exception {
       library = new Library();
       library.stock();
    }
    @Test
    public void listBooksTest() {
        assertEquals(0, 1);
    }
}
