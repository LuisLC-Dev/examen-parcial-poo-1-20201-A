package com.oop.exam.model;

import java.util.LinkedList;
import java.util.List;

public class Movie {
    private String Title;
    private int Year;
    private LinkedList<String> Actors;
    private String Synopsis;
    private String Director;
    private LinkedList<Platform> Platforms;
    private LinkedList<Review> Reviews;

    public Movie(String title, int year, String director) {
        Title = title;
        Year = year;
        Director = director;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public LinkedList<String> getActors() {
        return Actors;
    }

    public void setActors(List actors) {
        for(int i=0; i< actors.size(); i++) {
            Actors.add((String) actors.get(i));
        }
    }

    public String getSynopsis() {
        return Synopsis;
    }

    public void setSynopsis(String synopsis) {
        Synopsis = synopsis;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public LinkedList<Platform> getPlatforms() {
        return Platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        for(int i=0; i< platforms.size(); i++) {
            platforms.add(platforms.get(i));
        }
    }

    public LinkedList<com.oop.exam.model.Review> getReviews() {
        return Reviews;
    }

    public void setReviews(LinkedList<com.oop.exam.model.Review> reviews) {
        Reviews = reviews;
    }

    public void addReview(){

    }
}
