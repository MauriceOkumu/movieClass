package com.twu.biblioteca;

public class Moviebuilder {
    private int year;
    private String director;
    private String title;
    private String rating;

    public Moviebuilder(int year, String...args) {
        setYear(year);
        setDirector(args[1]);
        setRating(args[2]);
        setTitle(args[0]);
    }

    public String getDirector() {
        return director;
    }

    private void setDirector(String director) {
        this.director = director;
    }


    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }



    public String getRating() {
        return rating;
    }

    private void setRating(String rating) {
        this.rating = rating;
    }


    private void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public String toString() {
        return "Title : "+ getTitle()+ "  => Director : "+ getDirector()+ " => Rating : "+ getRating()+
                " => Release year :"+getYear();
    }
}
