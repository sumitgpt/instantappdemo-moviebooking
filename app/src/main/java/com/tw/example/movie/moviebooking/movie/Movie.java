package com.tw.example.movie.moviebooking.movie;

public class Movie {
    private int poster;
    private String name;
    private String Description;

    public Movie(int poster, String name, String description) {
        this.poster = poster;
        this.name = name;
        Description = description;
    }

    public int getPoster() {
        return poster;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }
}
