package org.example.javaAdvancedCoding.excercise.task2;

public abstract class Person {
    private String name;
    private String address;

    public Person() {
        this("", "");
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", name, address);
    }
}
