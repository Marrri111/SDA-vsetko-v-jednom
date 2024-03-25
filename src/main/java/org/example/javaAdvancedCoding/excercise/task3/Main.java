package org.example.javaAdvancedCoding.excercise.task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(), new Shape(), new Rectangle(), new Square());
        shapes.forEach(System.out::println);

    }
}
