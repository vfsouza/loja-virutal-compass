package com.loja.model;

import com.loja.dao.UserDAO;

public class User {
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate() {
        User u = UserDAO.readByUsername(this.username);
        if (u != null) {
            return u.getUsername().equals(this.username) && u.getPassword().equals(this.password);
        } else {
            return false;
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
