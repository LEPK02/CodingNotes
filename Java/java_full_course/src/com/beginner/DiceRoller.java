package com.beginner;

import java.util.Random;

public class DiceRoller {

    // Method 1: put random and number as arguments of roll()
    // DiceRoller() {

    //     Random random = new Random();
    //     int number = 0;
    //     roll(random, number);
    // }

    // void roll(Random random, int number) {

    //     number = random.nextInt(6) + 1;
    //     System.out.println(number);
    // }


    // Method 2: declare variables outside the method
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
