package org.example.javaAdvancedCoding.excercise.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor

public class Pair<T, P> {
    //Create the Pair class which, based on generic types, will allow to store any pair
    //of objects.
    T val1;
    P val2;

    public static void main(String[] args) {
        List<Pair> pairs = new ArrayList<Pair>();
        pairs.add(new Pair("kaťa", 20));
        Pair<Integer, String> peopleData = new Pair<>(20, "Lenka");
        Pair<Double, List<Integer>> peopleData2 = new Pair<>(20.00, List.of(10));
    }

}
