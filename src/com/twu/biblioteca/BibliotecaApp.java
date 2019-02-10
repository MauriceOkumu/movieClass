package com.twu.biblioteca;

import java.util.HashMap;

public class BibliotecaApp {


    public static void main(String[] args) {
        UserClass user = new UserClass(234567789,"Maurice","a.m@yahoo.com","abc-defg","234567789");
        System.out.println("Hello, And Welcome to the Library");
        user.showInfo();
        user.initialize();

    }
}
