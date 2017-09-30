package com.example.muridjonrahimov.test;

/**
 * Created by muridjonrahimov on 9/24/17.
 */

public class MathFunctions {

    private int a;
    private int x;

    public MathFunctions(int a, int x) {
        this.a = a;
        this.x = x;
    }

    public int add() {
        return a + x;
    }

    public int multiply() {
        return a * x;
    }

    public double divide() {
        double doubleA = a;
        double doubleX = x;
        return doubleA / doubleX;
    }

    public double average() {
        double doubleA = a;
        double doubleX = x;
        return (doubleA + doubleX) / 2;
    }

    public int minimum() {
        if (a < x) {
            return a;
        }
        return x;
    }

    public int maximum() {
        if (a > x) {
            return a;
        }
        return x;
    }
}





