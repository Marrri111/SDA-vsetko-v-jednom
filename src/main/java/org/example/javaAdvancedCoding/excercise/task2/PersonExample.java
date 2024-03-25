package org.example.javaAdvancedCoding.excercise.task2;

import java.util.ArrayList;

public class PersonExample {

    public static void main(String[] args) {
        ArrayList<Person> points = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                points.add(new Student(Student.Type.getFromNumber(i), i + 10, i * 20));
            } else {
                points.add(new Lecturer(Lecturer.Specialization.IT, i + 1));
            }
        }
        points.forEach(System.out::println);
    }
}
