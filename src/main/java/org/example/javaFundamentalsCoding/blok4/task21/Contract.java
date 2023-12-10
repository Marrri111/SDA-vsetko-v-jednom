package org.example.javaFundamentalsCoding.blok4.task21;

import java.time.LocalDate;

public class Contract {
    private LocalDate startDate;
    private LocalDate endDate;

    private int salary;

    public Contract(LocalDate startDate, LocalDate endDate, int salary) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
