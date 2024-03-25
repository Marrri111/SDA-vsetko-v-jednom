package org.example.javaAdvancedCoding.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondSE {
    public static void main(String[] args) {
        List<String> foods = List.of("chicken", "banana", "nut", "apple");

        List<String> collect = foods.stream()
                .map(p -> p.toUpperCase())
                .filter(a -> a.endsWith("T"))
                .sorted()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
        System.out.println();
        foods.forEach(System.out::println);
        System.out.println();

        List<Food> foodObj = foods.stream().map(s -> new Food(s)).collect(Collectors.toList());
        //same as above
        List<Food> foodObj2 = foods.stream()
                .map(Food::new)
                .sorted(new Comparator<Food>() {
                    @Override
                    public int compare(Food o1, Food o2) {
                        return o2.getName().compareToIgnoreCase(o1.getName());
                    }
                })
                //same as above
                .sorted((o1, o2) -> o2.getName().compareToIgnoreCase(o1.getName()))
                .collect(Collectors.toList());

        foodObj2.forEach(System.out::println);

        //count food with type FRUIT
        long size = foodObj2.stream().filter(d -> d.getType() == Food.Type.FRUIT).count();
        System.out.println(size);

        Map<Food.Type, List<Food>> foodByType = foodObj2.stream().collect(Collectors.groupingBy(f -> f.getType()));
        //same as above
        Map<Food.Type, List<Food>> foodByType2 = foodObj2.stream().collect(Collectors.groupingBy(Food::getType));

        System.out.println(" List of foods by type");
        foodByType2.keySet().forEach(type -> {
            System.out.println(type);
            foodByType2.get(type).forEach(System.out::println);
            System.out.println("*********");
        });


        System.out.println(foodByType);

        //find some fruit
        Optional<Food> first = foodObj.stream().filter(f -> f.getType() == Food.Type.FRUIT).findFirst();
        first.ifPresent(System.out::println);

        boolean canKarelLogin
                = canLogin("karel");

    }

    private static boolean canLogin(String userName) {
        return List.of("karel", "pepa", "jana")
                .stream().filter(u -> u.equals(userName)).findFirst().isPresent();
    }
}
