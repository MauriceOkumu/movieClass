package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserClassTest {
    UserClass user;
    @Before
    public void initializeClass() {
         user = new UserClass(234567789,"Maurice","a.m@yahoo.com","abc-defg","234567789");

    }
    @Test
    public void checkUserName() {
        assertEquals(user.getName(), "Maurice");
    }
    @Test
    public void checkEmail() {
        assertEquals(user.getEmail(), "a.m@yahoo.com");
    }
    @Test
    public void checkPassword() {
        assertEquals(user.getPassword(),"abc-defg");
    }
    @Test
    public void checkPhoneNumber() {
        assertEquals(user.getPhoneNumber(),"234567789");
    }
    @Test
    public void checkLibCard() {
        assertEquals(user.getLibraryNumber(), 234567789);
    }
}
