
package com.demo;

public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Hello from Jenkins Maven Project!");
        System.out.println("Addition Result: " + add(10, 20));
    }
}
