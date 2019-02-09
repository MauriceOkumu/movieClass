package com.twu.biblioteca;

public class Moviebuilder {
    private int year;
    private String director;
    private String title;
    private String rating;

    public Moviebuilder(int year, String...args) {
        setYear(year);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}
