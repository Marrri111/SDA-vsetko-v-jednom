package org.example.javaAdvancedCoding.stream;

import java.util.List;
import java.util.Optional;

public class ThirdSE {
    public static void main(String[] args) {
        List<String> inputList = List.of("Ahoj", "jak", "se", "mas");

        Optional<String> reduce = inputList.stream().reduce((s, s2) -> s + "," + s2);
        reduce.ifPresent(System.out::println);

        Optional<String> reduce2 = inputList.stream().filter(a -> false).reduce((s, s2) -> s + "," + s2);
        reduce2.ifPresent(System.out::println);
        if (reduce2.isPresent()) {
            System.out.println(reduce2.get());
        }

        List.of(1, 2, 3, 4, 5).stream().reduce((a, b) -> a + b).ifPresent(System.out::println);
    }
}
