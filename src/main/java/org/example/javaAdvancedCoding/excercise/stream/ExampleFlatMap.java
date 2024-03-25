package org.example.javaAdvancedCoding.excercise.stream;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleFlatMap {
    public static void main(String[] args) {

        Parent parent = new Parent("Karla", List.of(new Child("jana"), new Child("dana"), new Child("lenka")));
        Parent parent2 = new Parent("Jan", List.of(new Child("honza"), new Child("vojta"), new Child("lenvasek")));
        List<Parent> parents = List.of(parent, parent2);

        List<Child> allChild = parents.stream().flatMap(p -> p.childs.stream()).collect(Collectors.toList());
        allChild.forEach(System.out::println);
    }

    @AllArgsConstructor
    static class Parent {
        String name;
        List<Child> childs;
    }

    @AllArgsConstructor
    @ToString
    static class Child {
        String name;
    }
}
