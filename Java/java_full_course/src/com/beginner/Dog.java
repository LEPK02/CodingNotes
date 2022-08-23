package com.beginner;

public class Dog extends Animal {
    
    String breed;

    Dog (String gender, String breed) {

        super(gender);
        this.breed = breed;
    }

    public String toString () {

        return super.toString() + " " + this.breed.toLowerCase();
    }

    @Override
    public void spawn () {

        System.out.println("puppies!");
    }
}
