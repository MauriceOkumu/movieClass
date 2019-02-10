package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserClassTest {
    UserClass user;
    @Before
    public void initializeClass() {
         user = new UserClass("Maurice");

    }
    @Test
    public void checkUserName() {
        assertEquals(user.getName(), "Maurice");
    }
}
