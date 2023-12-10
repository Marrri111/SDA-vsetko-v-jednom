package org.example.javaFundamentalsCoding.blok4.task21;

public class Employee {
    private String employeeName;
    private int age;

    private Contract contract;

    Employee(String employeeName, int age, Contract contract) {
        this.employeeName = employeeName;
        this.age = age;
        this.contract = contract;
    }

    public int getAge() {
        return age;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Contract getContract() {
        return contract;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public void printEmployeeDetails() {
        System.out.println("___Employee details___");
        System.out.println("Employee's name: " + employeeName);
        System.out.println("Employee's age: " + age);
        System.out.println("Employee's salary: " + getContract().getSalary());
        System.out.println("Contract valid from: " + getContract().getStartDate());
        System.out.println("Contract valid until: " + getContract().getEndDate());


    }
}
