package com.twu.biblioteca;

import java.util.List;

public class UserClass {

    private String phoneNumber;
    private String name;
    private String email;
    private String password;

    public UserClass(String...vargs) {
        setName(vargs[0]);

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
    public void checkOutBook() {

    }
    public String showInfo() {
        return "The User info will be here";
    }
}
