package org.example.javaFundamentalsCoding.blok1.task3;

public class QuadraticCalculator {
    public int calculateDiscriminant(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);
        return delta;
    }

    public double rootX1(int a, int b, double squareRoot) {
        double x1 = (-b - squareRoot) / (2 * a);
        return x1;
    }

    public double rootX2(int a, int b, double squareRoot) {
        double x2 = (-b + squareRoot) / (2 * a);
        return x2;
    }
}
