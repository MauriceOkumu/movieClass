package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.*;

public class Library {
    public int num = 1;
    private List<Moviebuilder> listOfMovies;

    public void listBooks() {
        for(Object obj: listOfMovies) {
            System.out.printf("%d : %s%n",num,obj.toString());
            num++;
        }

    }
    public void stock() {
        listOfMovies = new ArrayList<Moviebuilder>();
        listOfMovies.add(new Moviebuilder(2009, "Courage the cowardly dog", "Towers","No rating"));
        listOfMovies.add(new Moviebuilder(2013,"Escape from sobibor", "Joe", "5 stars"));
        listOfMovies.add(new Moviebuilder(1987,"Amargeddon","Steve", "10 stars"));
        listOfMovies.add(new Moviebuilder(2020, "Snow", "Flaky","10 stars"));
        listOfMovies.add(new Moviebuilder(2009, "Heat", "Sun","10 stars"));
        listOfMovies.add(new Moviebuilder(2011,"The Beginning", "Adam","3 stars"));
        listOfMovies.add(new Moviebuilder(2010,"Coding","Java","10 stars"));
        listOfMovies.add(new Moviebuilder(2009,"Star Wars","Atoti", "6 stars"));
        listOfMovies.add(new Moviebuilder(2007, "You got mail","Internet","4 stars"));

    }
    public void initiate() {
        stock();
    }
    public List<Moviebuilder> getMovie() {
        return listOfMovies;
    }

}
