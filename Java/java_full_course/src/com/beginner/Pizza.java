package com.beginner;

public class Pizza {
    
    String crust;
    String sauce;
    String cheese = "no";
    String topping = "no toppings";

    Pizza (String crust, String sauce) {

        this.crust = crust;
        this.sauce = sauce;
    }

    Pizza (String crust, String sauce, String cheese) {

        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza (String crust, String sauce, String cheese, String topping) {

        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    void printOrder () {
        System.out.printf("Your order is:\n1. %s crust\n2. %s sauce\n3. %s cheese\n4. %s\n", crust, sauce, cheese, topping);
    }
}
