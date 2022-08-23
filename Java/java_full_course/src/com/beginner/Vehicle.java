package com.beginner;

public abstract class Vehicle {
    
    double topSpeed;

    abstract void buy ();

    void start () {

        System.out.println("This vehicle has moved off");
    }

    void stop () {

        System.out.println("This vehicle has stopped");
    }
}
