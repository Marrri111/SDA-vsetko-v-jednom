package org.example.javaAdvancedCoding.excercise.task1;

import java.util.ArrayList;

public class PointDemo {
    public static void main(String[] args) {
        ArrayList<Point2D> points = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                points.add(new Point2D(i, i + 10));
            } else {
                points.add(new Point3D(i, i + 1, i + 100));
            }
        }
        points.forEach(System.out::println);
    }
}
