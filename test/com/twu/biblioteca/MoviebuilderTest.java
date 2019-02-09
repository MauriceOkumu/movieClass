package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoviebuilderTest {
    private Moviebuilder movieList;
    @Before
    public void initializeClass() throws Exception {
        movieList =  new Moviebuilder(1998,"Shawshank redemption","Maurice","6 stars");
    }
    @Test
    public void tesIfpolpulated() {
        assertEquals(movieList.getYear(), 1998);
    }
    @Test
    public void checkTitle() {
        assertEquals(movieList.getTitle(), "Shawshank redemption");
    }
    @Test
    public void checkRating() {
        assertEquals(movieList.getRating(), "6 stars");
    }
    @Test
    public void checkDirector() {
        assertEquals(movieList.getDirector(), "Maurice");
    }


}
