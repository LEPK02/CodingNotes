package com.beginner;

public class Rabbit implements Prey, Predator {
    
    @Override
   public void flee () {

    System.out.println("The rabbit has ran away");
   }

    @Override
    public void hunt () {
    
    System.out.println("The rabbit is eating");
   }
}
