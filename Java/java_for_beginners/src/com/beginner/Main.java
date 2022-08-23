package com.beginner;

import java.util.ArrayList;
import java.util.Random;
import java.lang.System;
import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;
import java.lang.Float;
import java.lang.Integer;
import java.awt.Point;
import java.util.Date;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Primitive types
        // 1 Byte
        byte age = 20;
        age = 21;

        // 2 Bytes
        short halfInt = -32_000;

        // 4 Bytes
        int length = 200, width = 300;
        int dist = length;

        // 8 Bytes
        long viewCount = 3_456_789_123L;

        // 4 Bytes
        float price = 9.99F;

        // 8 Bytes
        double bigFloat = 9.99999999999;

        // 2 Bytes
        char letter = 'A';

        // 1 Byte
        boolean isTrue = false;


        // Reference types
        Date today = new Date();

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        // System.out.println(point2);


        // String methods
        String message = "Hello \"World\"" + "!";
        int msgLength = message.length();
        int oIndex = message.indexOf("o");
        boolean ends = message.endsWith("!");
        message.replace("!", "?");
        message.toUpperCase();
        message.trim();
        // System.out.println(message);
        String formatMessage = message.replace("!", "?").toUpperCase().trim();
        // System.out.println(formatMessage);
        String name = "Bob";
        boolean ignoreCase = name.equalsIgnoreCase("Bob");
        // System.out.println(ignoreCase);
        int nameLength = name.length();
        // System.out.println(nameLength);
        char charByIdx = name.charAt(2);
        // System.out.println(charByIdx);
        int idxOfChar = name.indexOf("ob");
        // System.out.println(idxOfChar);
        boolean nameEmpty = name.isEmpty();
        // System.out.println(nameEmpty);
        
        // Escape sequences
        String newline = "\n";
        String tab = "\t";


        // Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        // System.out.println(numbers);
        int[] arr = { 5, 4, 3, 2, 1 };
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr.length);

        // Multi=dimensional arrays
        int[][] arr2D = {{ 1, 2, 3 }, { 4, 5, 6 }};
        int[][] emptyArr2D = new int[2][3];
        // System.out.println(Arrays.deepToString(arr2D));


        // Constants
        final float PI = 3.14F;


        // Arithmetic expressions
        int add = 10 + (int)1.5;
        // System.out.println(add);
        int divideInt = 10 / 3;
        // System.out.println(divideInt);
        float divideFloat = (float)10 / (float)3;
        // System.out.println(divideFloat);

        // Increment operator
        int x = 1;
        int y = x++;
        // System.out.println(Integer.toString(x) + ", " + Integer.toString(y));
        x = 1;
        y = ++x;
        // System.out.println(Integer.toString(x) + ", " + Integer.toString(y));
        x += 2;


        // Implicit casting
        float implicitCast = 1 + PI;
        // System.out.println(implicitCast);
        // int incompatibleTypes = 1 + PI; // throws error

        // Casting strings to primitive types
        int castStringToInt = Integer.parseInt("1");
        float castStringToFloat = Float.parseFloat("10");
        // System.out.println(castStringToInt + castStringToFloat);


        // Math class
        int roundToInt = Math.round(1.1F);
        float roundToFloat = Math.round(1.1F);
        // System.out.println(roundToInt + ", " + roundToFloat);

        // ceil and floor need explicit typecasting to int or float (from double)
        int ceilFloat = (int)Math.ceil(1.1F);
        int floorFloat = (int)Math.floor(1.1F);
        // System.out.println(ceilFloat + ", " + floorFloat);

        int largerInt = Math.max(69, 70);
        int smallerInt = Math.min(69, 70);
        // System.out.println(largerInt + ", " + smallerInt);

        // Gives a random double between 0 and 1
        double randomDouble = Math.random();
        int randomInt = (int) (Math.round(Math.random() * 100)); // gives random number between 0 and 100
        // System.out.println(randomInt);

        age = (byte) Math.abs(-3);
        // System.out.println(age);
        float squareRoot = (float) Math.sqrt(123);
        // System.out.println(squareRoot);


        // Random
        Random random = new Random();
        // Generates number from 1 to 6
        int randomInteger = random.nextInt(6) + 1;
        // System.out.println(randomInteger);


        // Formatting numbers
        // Format to currency
        NumberFormat currencyFactory = NumberFormat.getCurrencyInstance();
        String currency = currencyFactory.format(1234567.89123);
        // System.out.println(currency);

        // Format to percentage
        NumberFormat percentFactory = NumberFormat.getPercentInstance();
        String percent = percentFactory.format(1.01);
        // System.out.println(percent);

        // Reading input
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("What is your age? ");
        // age = scanner.nextByte(); // age already defined
        // System.out.println("You are " + age + " years old.\n");
        // scanner = new Scanner(System.in);
        // System.out.print("What is your name? ");
        // String name = scanner.nextLine().trim();
        // System.out.println("Hello " + name + "!");


        // Comparison operator (for comparing primitive data types)
        x = 1;
        y = 1;
        // System.out.println(x==y);
        // System.out.println(x!=y);
        // System.out.println(x<=y);


        // Logical operators
        int temperature = 32;
        boolean isWarm = temperature > 20 && temperature < 30;
        // System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean eligibleForLoan = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        // System.out.println(eligibleForLoan);


        // If statements
        // temperature = 32;
        // if (temperature == 32) {
        //     System.out.println("It's a hot day");
        //     System.out.println("Drink water");
        // } else if (temperature > 20 && temperature <= 30) {
        //     System.out.println("Beautiful day");
        // } else {
        //     System.out.println("Cold day");
        // }

        // Simplifying if statements
        int wage = 120_000;
        boolean hasHighWage = (wage > 100_000); // if income > 100_000 {hasHighIncome = true} else {hasHighIncome = false}
        // System.out.println(hasHighWage);


        // Ternary operator
        int ticketPrice = 1000;
        String ticketClass = (ticketPrice >= 1000) ? "First" : "Economy";
        // System.out.println(ticketClass);


        // Switch statements
        // String role = "admin";
        // switch (role) {
        //     case "admin":
        //         System.out.println("You're an admin");
        //         break;
        //     case "moderator":
        //         System.out.println("You're a moderator");
        //         break;
        //     default:
        //         System.out.println("You're a guest");
        // }


        // Fizzbuzz exercise
        // System.out.print("Number to Fizzbuzz: ");
        // Scanner scanner = new Scanner(System.in);
        // int fizzNumber = scanner.nextInt();

        // if (fizzNumber % 5 == 0 && fizzNumber % 3 == 0) {
        //     System.out.println("Fizzbuzz");
        // } else if (fizzNumber % 5 == 0 && fizzNumber % 3 != 0) {
        //     System.out.println("Fizz");
        // } else if (fizzNumber % 5 != 0 && fizzNumber % 3 == 0) {
        //     System.out.println("buzz");
        // } else {
        //     System.out.println(fizzNumber);
        // }


        // For loops
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println(i);
        // }

        // for (int i = 5; i > 0; i--) {
        //     System.out.println(i);
        // }


        // While loops
        // String input = "";
        // Scanner scanner = new Scanner(System.in); // use scanner outside the while loop to reduce memory expenditure
        // while (!input.equals("quit")) { // cannot use comparison operators as String is a reference type
        //     System.out.print("Type \"quit\" to quit: ");
        //     input = scanner.next().toLowerCase();
        //     System.out.println(input);
        // }


        // Do-while loops
        // String input = "";
        // Scanner scanner = new Scanner(System.in);
        // do {
        //     System.out.print("Type \"quit\" to quit: ");
        //     input = scanner.next().toLowerCase();
        //     System.out.println(input);
        // }
        // while (!input.equals("quit"));


        // Break and continue
        // String input = "";
        // Scanner scanner = new Scanner(System.in);
        // while (true) {
        //     System.out.print("Type \"quit\" to quit: ");
        //     input = scanner.next().toLowerCase();
        //     if (input.equals("quit")){
        //         break;    
        //     }
        //     if (input.equals("pass")){
        //         continue;    
        //     }
        //     System.out.println(input);
        // }


        // For-each loop
        // Note: limitation is that for-each loops can only iterate forwards, while for looops can iterate backwards
        // String[] fruits = { "Apple", "Mango", "Orange" };
        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }
        // for (String fruit : fruits) {
        //     System.out.println(fruit);
        // }


        // // Mortgage calculator exercise
        // // Collect user input
        // System.out.print("Principal ($1K - $1M): ");
        // Scanner scanner = new Scanner(System.in);
        // int principal = 0;
        // while (true) {
        //     principal = scanner.nextInt();
        //     if (principal >= 1000 && principal <= 1_000_000) {
        //         break;
        //     }
        //     System.out.print("Enter a value between 1,000 and 1,000,000: ");
        // }

        // System.out.print("Annual interest rate (0 - 30): ");
        // scanner = new Scanner(System.in);
        // float annualIR = -1;
        // while (true) {
        //     annualIR = scanner.nextFloat();
        //     if (annualIR >= 0 && annualIR <= 30) {
        //         break;
        //     }
        //     System.out.print("Enter a value between 0 and 30 (without the \"%\" symbol): ");
        // }
        // float monthlyIR = annualIR / 1200;

        // System.out.print("Period (years): ");
        // scanner = new Scanner(System.in);
        // int period = 0;
        // while (true) {
        //     period = scanner.nextInt();
        //     if (period > 0 && period <= 30) {
        //         break;
        //     }
        //     System.out.print("Enter a value between 1 and 30: ");
        // }
        // period = period * 12;
        

        // // Calculate mortgage
        // double m = principal * ((monthlyIR * Math.pow(1 + monthlyIR, period)) / (Math.pow(1 + monthlyIR, period) - 1));

        // // Format and print mortgage
        // NumberFormat formatMortgage = NumberFormat.getCurrencyInstance();
        // String mortgage = formatMortgage.format(m);
        // System.out.print("Your mortgage is: " + mortgage);

        // scanner.close();


        // Wrapper classes
        // Autoboxing: automatic conversion of primitive datatypes to their respective wrapper classes (reference types)
        Boolean a = true;
        Character b = '@';
        Integer c = 21;
        Double d = 3.14;
        String e = "hello";

        // Unboxing: reverse of autoboxing; automatic conversion of wrapper classes to primitive types
        if (a == true) {
            // System.out.println("a is true");
        }


        // ArrayList
        // Resizable arrays that store reference data types. Elements can be added and removed after compilation phase
        ArrayList <String> food = new ArrayList <String> ();

        food.add("pizza");
        food.add("burger");
        food.add("fries");

        food.set(0, "chicken");
        food.remove(2);

        // for (int i=0; i < food.size(); i++) {
        //     System.out.println(food.get(i));
        // }

        food.clear();

        // 2D ArrayList
        ArrayList <ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList <String> bakeryList = new ArrayList<>();
        bakeryList.add("bun");
        bakeryList.add("bread");
        bakeryList.add("cake");

        ArrayList <String> produceList = new ArrayList<>();
        produceList.add("vegetables");
        produceList.add("meat");
        produceList.add("dairy");

        ArrayList <String> drinksList = new ArrayList<>();
        drinksList.add("coke");
        drinksList.add("pepsi");
        drinksList.add("sprite");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        // System.out.println(groceryList.get(0).get(1));

        groceryList.clear();
        bakeryList.clear();
        produceList.clear();
        drinksList.clear();


        // Methods
        // hello (name, age);
        // int z = add (x, y);

        // Overloaded methods: methods with the same name but have different parameters
        // Note: method signature = method name + parameters
        // add (1,2);
        // add (1.0F,2.0F,3);


        // printf --> prints to console
        // % [flags] [precision] [width] [conversion-character]

        // [conversion-character]
        // System.out.printf("Decimal integers: %d\n", 123);
        // System.out.printf("Boolean: %b\n", true);
        // System.out.printf("Char: %c\n", '@');
        // System.out.printf("String: %s\n", "hello");
        // System.out.printf("Double: %f\n", 3.14);

        // [width] --> minimum number of characters to be written as output
        // System.out.printf("Hello %10s", "hi");

        // [precision] --> sets number of digits of precision when outputting floating-point values
        // System.out.printf("2 d.p.: %.2f", 100F);

        // [flags] --> adds effect to output based on the flag added to the format specifier
        // System.out.printf("Left-justify: %-10s", "hello");
        // System.out.printf("Show positive/negative: %+f\n", 99F);
        // System.out.printf("Zero-pad numeric values: %010f\n", 300F);
        // System.out.printf("Comma grouping separators for numbers: %,d", 1000000);
    }

    static void hello (String name, int age) {
        System.out.println("hello " + name + ", you are " + age + " years old!");
    }

    static int add (int x, int y) {
        System.out.println("Sum is " + (x + y)  + "\tOverloaded method #1");
        return x + y;
    }

    static float add (float x, float y, int z) {
        System.out.println("Sum is " + (x + y + z) + "\tOverloaded method #2");
        return x + y;
    }
}
