package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibrarianClassTest {
    private Librarian librarian;
    @Before
    public void initializeClass() {
        librarian = new Librarian();
        librarian.addUserWhoBorrowedBook();
    }
    @Test
    public void checkPage() {
        assertEquals(librarian.getUsersWoHaveBooks().get(0),"Maurice");
    }
    @Test
    public void checkListOfBorrowers() {
        assertEquals(librarian.getUsersWoHaveBooks().size(), 1);
    }
}
