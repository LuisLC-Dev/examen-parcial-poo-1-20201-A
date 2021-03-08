package com.oop.exam.service;

import com.oop.exam.model.Movie;

import java.util.LinkedList;

public class MovieManager {
    private LinkedList<Movie> movies;

    public MovieManager() {
        this.movies = new LinkedList<>();
    }

    public LinkedList<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie Movie){
        movies.add(Movie);
    }

    public Movie findMovie(String Movie){
        for (com.oop.exam.model.Movie movie : movies) {
            String llElement = movie.getTitle();

            if (llElement == Movie) {
                return movie;
            }
        }
        return null;
    }
}
