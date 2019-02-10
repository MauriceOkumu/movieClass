package com.twu.biblioteca;

import java.util.HashMap;

public class UserClass {

    private String phoneNumber;
    private String name;
    private String email;
    private String password;
    public int num = 0;
    private int libraryNumber;
    public HashMap<Integer, Moviebuilder> checkedOutBooks;
    public Library myLibrary;
    ScannerClass reader;
    String byebye;

    public UserClass(int libNumber, String... vargs) {
        setName(vargs[0]);
        setEmail(vargs[1]);
        setPassword(vargs[2]);
        setLibraryNumber(libNumber);
        setPhoneNumber(vargs[3]);
        checkedOutBooks = new HashMap<Integer, Moviebuilder>();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(int libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public void checkOutBook() {
        myLibrary.checkoutMovies(this);
        goHome(this);

    }

    public void showInfo() {
        System.out.printf("Name : %s%nEmail : %s%nPhone Number %s%n", getName(), getEmail(), getPhoneNumber());
    }

    public void goHome(UserClass user) throws NullPointerException {
        reader = new ScannerClass();
        System.out.print("Do you wish to quit the Application? yes to quit or any other thing to continue");
        try {
            byebye = reader.scan();
            if (byebye.equals("yes")) {
                System.exit(0);
            } else {
                checkOutBook();
            }
        } catch (NullPointerException e) {
            System.out.println("Oink");

        }
    }
        public void initialize () {
            myLibrary = new Library();
            checkOutBook();
        }
}
