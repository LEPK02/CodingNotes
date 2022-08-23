package com.beginner;

public class Cat extends Animal {
    
    Cat (String gender) {

        super(gender);
    }


    @Override
    public void spawn () {

        System.out.println("kittens!");
    }
}
