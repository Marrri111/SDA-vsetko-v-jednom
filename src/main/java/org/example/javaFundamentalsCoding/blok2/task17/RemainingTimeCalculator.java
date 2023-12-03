package org.example.javaFundamentalsCoding.blok2.task17;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RemainingTimeCalculator {
    public static void main(String[] args) {
        calculateDaysLeft();
    }

    public static void calculateDaysLeft() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String classDate = scanner.nextLine();

        //convert String to LocalDate
        LocalDate classDate1 = LocalDate.parse(classDate, formatter);
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate.until(classDate1).getDays());//iba v prípade ak je to kratšie ako jeden mesiac
    }
}
