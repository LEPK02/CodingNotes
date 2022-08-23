package com.beginner;

public class Car extends Vehicle {
    
    String make = "Chervolet";
    String model = "Corvette";
    int year = 2018;
    String colour = "Blue";
    String name;
    double price;
    private String ownerName;

    Car (String name, String ownerName) {

        this.name = name;
        this.setOwnerName(ownerName);
    }

    // Overloaded method - copy
    Car (Car car) {

        this.copy(car);
    }

    public String toString () {
        
        return make + "\n" + model + "\n" + year + "\n" + hashCode();
    }

    @Override
    void buy () {
        System.out.println("Buy for " + this.price + "?");
    }

    // Getter method for owner name
    public String getOwnerName () {

        return ownerName;
    }

    // Setter method for owner name
    public void setOwnerName (String ownerName) {

        this.ownerName = ownerName;
    }

    // Copy another object to this object
    public void copy (Car car) {

        this.setOwnerName(car.getOwnerName());
    }

    void drive () {
        System.out.println("You drive the car");
    }

    void brake () {
        System.out.println("You step on the brakes");
    }

}
