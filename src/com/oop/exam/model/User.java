package com.oop.exam.model;

public class User {
    private String Username;
    private String Email;

    public User(String username, String email) {
        Username = username;
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
