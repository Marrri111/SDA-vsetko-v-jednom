package org.example.javaFundamentalsCoding.blok4.task21;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Company company1 = new Company("Nasa firma", LocalDate.of(2020, 12, 23));

        while (true) {
            try {
                System.out.println("Do you want to continue? ");
                String continueInput = sc.nextLine();
                if (continueInput.equals("stop")) {
                    System.out.println("Printing employee information");
                    company1.printAllEmployeeInformation();
                    break;
                }

                System.out.println("Enter employee name:");
                String employee1 = sc.nextLine();
                System.out.println("Enter employee age: ");
                int employeeAge = Integer.parseInt(sc.nextLine());
                System.out.println("Enter employee salary: ");
                int employeeSalary = Integer.parseInt(sc.nextLine());

                LocalDate startdate = LocalDate.of(2023, Month.DECEMBER, 9);
                LocalDate end_date = startdate.plusDays(365);

                Contract contract1 = new Contract(startdate, end_date, employeeSalary);
                Employee newEmployee = new Employee(employee1, employeeAge, contract1);

                company1.addEmployee(newEmployee);

//            newEmployee.printEmployeeDetails();
//            sc.close();
            } catch (Exception e) {
                System.out.println("Invalid option");
                System.exit(1);
                sc.close();
            }

        }


    }

}
