package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.*;

public class Library {
    public int num = 1;
    public HashMap<Integer, Moviebuilder> listOfMovies;

    public void listMovies() {
        for (HashMap.Entry<Integer, Moviebuilder> entry : listOfMovies.entrySet()) {
            System.out.println(entry.getKey() + " : : " + entry.getValue());
        }

    }
    public void stock() {
        listOfMovies = new HashMap<Integer, Moviebuilder>();

        listOfMovies.put(num++,new Moviebuilder(2009, "Courage the cowardly dog", "Towers","No rating"));
        listOfMovies.put(num++,new Moviebuilder(2013,"Escape from sobibor", "Joe", "5 stars"));
        listOfMovies.put(num++,new Moviebuilder(1987,"Amargeddon","Steve", "10 stars"));
        listOfMovies.put(num++,new Moviebuilder(2020, "Snow", "Flaky","10 stars"));
        listOfMovies.put(num++,new Moviebuilder(2009, "Heat", "Sun","10 stars"));
        listOfMovies.put(num++,new Moviebuilder(2011,"The Beginning", "Adam","3 stars"));
        listOfMovies.put(num++,new Moviebuilder(2010,"Coding","Java","10 stars"));
        listOfMovies.put(num++,new Moviebuilder(2009,"Star Wars","Atoti", "6 stars"));
        listOfMovies.put(num++,new Moviebuilder(2007, "You got mail","Internet","4 stars"));

    }
    public void initiate() {

        stock();
//        listMovies();
    }
}
