package org.example.javaAdvancedCoding.excercise.generic;

import java.util.function.Predicate;

public class Task2 {

    //Design the countIf generic method wich, based on an array of elements of any
    //type will count the number of elements meeting the condition using an
    //functional interface. Any interface implemented anonymously can be a function.

    public static void main(String[] args) {
        int i = countIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }, 1, 2, 3, 4, 5, 6, 8, 90, 111);
        System.out.println(i);

        int i2 = countIf(integer -> integer % 2 == 0, 1, 2, 3, 4, 5, 6, 8, 90, 111);
        System.out.println(i2);

        int i3 = countIf(integer -> Character.isUpperCase(integer.charAt(0)), "Ahoj", "světe", "Jak", "se", "Máš");
        System.out.println(i3);

        int i4 = countIf(integer -> !Character.isUpperCase(integer.charAt(0)), "Ahoj", "světe", "Jak", "se", "Máš");
        System.out.println(i4);

        //int i4 = countIf(integer -> Character.isLowerCase(integer.charAt(0)), "Ahoj", "světe", "Jak", "se","Máš");
        //System.out.println(i4);
    }

    public static <T> int countIf(Predicate<T> test, T... elements) {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (test.test(elements[i])) {
                count++;
            }
        }
        return count;
    }
}
