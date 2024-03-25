package org.example.javaAdvancedCoding.excercise.task2;

public class Lecturer extends Person {
    private Specialization scec;
    private int salary;

    public Lecturer(Specialization scec, int salary) {
        this.scec = scec;
        this.salary = salary;
    }

    public Specialization getScec() {
        return scec;
    }

    public void setScec(Specialization scec) {
        this.scec = scec;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "scec=" + scec +
                ", salary=" + salary +
                '}';
    }

    enum Specialization {
        IT,
        MATH,
        SCIENCE
    }
}
