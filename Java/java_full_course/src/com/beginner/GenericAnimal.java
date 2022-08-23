package com.beginner;

import java.lang.Number;

public class GenericAnimal <Thing, Thing2 extends Number> {
    
    Thing x;
    Thing2 y;

    GenericAnimal (Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing getGender () {
        System.out.println(x);
        return x;
    }

    public Thing2 getAge () {
        System.out.println(y);
        return y;
    }
}
