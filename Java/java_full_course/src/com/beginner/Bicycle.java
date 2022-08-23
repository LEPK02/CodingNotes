package com.beginner;

public class Bicycle extends Vehicle {
    
    int wheels = 2;
    double topSpeed = 10.0;
    double price;

    Bicycle (double price) {

        this.price = price;
    }

    @Override
    void buy () {
        System.out.println("Buy for " + this.price + "?");
    }
}
