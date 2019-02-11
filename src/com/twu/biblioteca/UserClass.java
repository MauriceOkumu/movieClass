package com.twu.biblioteca;

import java.util.HashMap;

public class UserClass {

    private String phoneNumber;
    private String name;
    private String email;
    private String password;
    public int num = 0;
    private String libraryNumber;
    public HashMap<Integer, Moviebuilder> checkedOutBooks;
    public Library myLibrary;
    ScannerClass reader;
    String byebye;
    public UserinputCapture captureInput;

    public UserClass() {
        captureInput = new UserinputCapture();
        captureInput.UserinputCaptureRun();
        setName();
        setEmail();
        setPassword();
        setLibraryNumber();
        setPhoneNumber();
        checkedOutBooks = new HashMap<Integer, Moviebuilder>();

    }


    public String getName() {
        return name;
    }

    public void setName() {
        this.name = captureInput.name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = captureInput.email;
    }


    public void setPassword() {
        this.password = captureInput.password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        this.phoneNumber = captureInput.phoneNumber;
    }


    public void setLibraryNumber() {
        this.libraryNumber = captureInput.libNumber;
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
        System.out.print("Do you wish to quit the Application? yes to quit or any other thing to see your info");
        try {
            byebye = reader.scan();
            if (byebye.equals("yes")) {
                System.out.println("Thank you for stopping by. Bye Bye!");
                System.exit(0);
            } else {
                showInfo();
                System.out.println("Rerun the program if you want to checkout a movie!");
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
