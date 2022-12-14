package com.movie.movieDb;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.String;
import java.util.ArrayList;



@Entity
@Table(name = "Movies")
public class Movie {
    private long  id;
    private String show_name;
    private ArrayList<Quote> quotes;

    public Movie() {
    }
    public Movie(String show_name) {
        this.show_name = show_name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShow_name() {
        return this.show_name;
    }

    public void setShow_name(String show_name) {
        this.show_name = show_name;
    }

    public Movie id(long id) {
        setId(id);
        return this;
    }

    public Movie show_name(String show_name) {
        setShow_name(show_name);
        return this;
    }

    public ArrayList<Quote> getQuotes() {
        return this.quotes;
    }

    public void setQuotes(ArrayList<Quote> quotes) {
        this.quotes = quotes;
    }



}