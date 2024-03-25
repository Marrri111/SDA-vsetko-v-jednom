package org.example.javaAdvancedCoding.lambdas.functional;

import java.util.function.Function;

public class FoodFactory {


    void proccessFood(Object food, Function<Object, String> foodProccesor) {

        String product = foodProccesor.apply(food);
        System.out.println(" proccesed food to " + product);
    }

    public static void main(String[] args) {

        FoodFactory foodFactory = new FoodFactory();
        Function<Object, String> chickenReceipe = chicken -> "chicken steak";
        foodFactory.proccessFood(new Chicken(), chickenReceipe);

        foodFactory.proccessFood(new Carrot(), c -> "pickles");
    }


    static class Carrot {

    }

    static class Chicken {

    }
}

