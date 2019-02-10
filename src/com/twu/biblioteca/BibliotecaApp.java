package com.twu.biblioteca;

public class BibliotecaApp {


    public static void main(String[] args) {
        Library lib = new Library();
        System.out.println("Hello, And Welcome to the Library");
        lib.initiate();
        lib.listBooks();
    }
}
