package org.example.javaFundamentalsCoding.blok4.task21;

import java.time.LocalDate;

public class Company {
    private String companyName;
    private LocalDate dateOfEstablishment;
    Employee[] arrayOfEmployees = new Employee[5];
    int employeeCounter = 0;


    public Company(String companyName, LocalDate dateOfEstablishment) {
        this.companyName = companyName;
        this.dateOfEstablishment = dateOfEstablishment;
    }


    public void addEmployee(Employee employee) {
        arrayOfEmployees[employeeCounter] = employee;
        employeeCounter++;
        if (employeeCounter == 6) {
            System.out.println("Maximum number of employees reached. Cannot create more employees.");
        }
    }

    public void printAllEmployeeInformation() {
        for (int i = 0; i < employeeCounter; i++) {
            arrayOfEmployees[i].printEmployeeDetails();
        }
    }
}
