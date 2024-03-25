package org.example.javaAdvancedCoding.excercise.taskN;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(), new Rectangle(), new Square());
        shapes.forEach(shape -> {
            System.out.println(shape);
            System.out.println(shape.getPerimeter());
        });
    }
}
