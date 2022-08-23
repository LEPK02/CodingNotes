package com.beginner;

import java.io.Serializable;

public class User implements Serializable {

    String username;
    transient String password;
    private static final long serialVersionUID = 1;

    User (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login () {

        System.out.println(username + " is logged in");
    }
}
