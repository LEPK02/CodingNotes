package com.beginner;

public class Animal {
    
    String gender;

    Animal (String gender) {

        this.gender = gender;
    }

    public String toString () {

        return this.gender;
    }

    void spawn () {

        System.out.println("Hello world!");
    }
}
