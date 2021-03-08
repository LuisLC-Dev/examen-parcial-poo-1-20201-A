package com.oop.exam.model;

public class Review {
    private User User;
    private MovieScore Score;
    private String Review;

    public Review(com.oop.exam.model.User user, MovieScore score, String review) {
        User = user;
        Score = score;
        Review = review;
    }

    public com.oop.exam.model.User getUser() {
        return User;
    }

    public void setUser(com.oop.exam.model.User user) {
        User = user;
    }

    public MovieScore getScore() {
        return Score;
    }

    public void setScore(MovieScore score) {
        Score = score;
    }

    public String getReview() {
        return Review;
    }

    public void setReview(String review) {
        Review = review;
    }
}
