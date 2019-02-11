package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
    private Library library;
    private List usersWhoHaveBooks;
    public ScannerClass askThem;
    public String answer;
    public UserClass user;

    public Librarian() {
        library = new Library();
        this.usersWhoHaveBooks = new ArrayList<String>();
        library.stock();
        showMoviesInLibrary();
        opttoSignIn();
    }
    public void addUserWhoBorrowedBook() {
        usersWhoHaveBooks.add("Maurice");
    }
    public List getUsersWoHaveBooks() {
        return usersWhoHaveBooks;
    }
    public void showMoviesInLibrary() {
        library.listMovies();
    }
    public void opttoSignIn() {
        askThem = new ScannerClass();
        System.out.print("Do you wish to sign in to be able to checkout a movie  type (yes / no)? :");
        answer = askThem.scan();
        if(answer.equals("yes")){
            user = new UserClass();
            user.initialize();
        } else {
            System.out.println("Thank you. You can always restart the App to check a movie out!");
        }

    }
}
