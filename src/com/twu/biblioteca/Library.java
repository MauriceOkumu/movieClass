package com.twu.biblioteca;

import java.util.*;

public class Library {
    public int num = 1;
    public HashMap<Integer, Moviebuilder> listOfMovies;
    public ScannerClass reader;
    public String answer;
    Moviebuilder checkedoutMovie;

    public void listMovies() {
        for (HashMap.Entry<Integer, Moviebuilder> entry : listOfMovies.entrySet()) {
            System.out.println(entry.getKey() + " : : " + entry.getValue());
        }

    }
    public void stock() {
        listOfMovies = new HashMap<Integer, Moviebuilder>();

        listOfMovies.put(num++,new Moviebuilder(2009, "Courage the cowardly dog", "Towers","No rating"));
        listOfMovies.put(num++,new Moviebuilder(2013,"Escape from sobibor", "Joe", "5 stars"));
        listOfMovies.put(num++,new Moviebuilder(1987,"Armageddon","Steve", "10 stars"));
        listOfMovies.put(num++,new Moviebuilder(2020, "Snow", "Flaky","10 stars"));
        listOfMovies.put(num++,new Moviebuilder(2009, "Heat", "Sun","10 stars"));
        listOfMovies.put(num++,new Moviebuilder(2011,"The Beginning", "Adam","3 stars"));
        listOfMovies.put(num++,new Moviebuilder(2010,"Coding","Java","10 stars"));
        listOfMovies.put(num++,new Moviebuilder(2009,"Star Wars","Atoti", "6 stars"));
        listOfMovies.put(num++,new Moviebuilder(2007, "You got mail","Internet","4 stars"));

    }
    public void initiate() {
        reader = new ScannerClass();
        stock();
        //reader.close();
    }

    public void checkoutMovies(UserClass user) {
        initiate();
        System.out.print("Do you want to see the movies available ? type (yes /no)");
        answer = reader.scan();
        if(answer.equals("yes")) {
            listMovies();
            user.checkedOutBooks.put(user.num++,chooseMovie());

        } else {
            System.out.println("Okay thank you . Feel free to rerun the page if you change your mind!");
        }

    }

    public Moviebuilder chooseMovie() throws NullPointerException{
        int input;
       System.out.print("Choose a Movie Number from the list above to checkout a Movie");
       try {
           input = Integer.parseInt(reader.scan());
           System.out.println("This is the movie you checked out");
           checkedoutMovie = listOfMovies.get(input);
           System.out.println(checkedoutMovie.toString());
           listOfMovies.remove(input);
           return checkedoutMovie;
       }catch(NullPointerException e) {
           System.out.printf("You did not choose from 1 to 9. Try again ");
           chooseMovie();
       }
       return checkedoutMovie;

    }


}
