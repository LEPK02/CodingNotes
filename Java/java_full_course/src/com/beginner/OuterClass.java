package com.beginner;

public class OuterClass {
    
    String x = "Hello ";

    public class InnerClass {

        String y = "World";

        public void greeting() {
            System.out.println(x + y);
        }
    }
}
