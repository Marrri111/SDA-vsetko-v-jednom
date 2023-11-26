package org.example.javaFundamentals.november.dvadsiatypiaty;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTime3 {
    public static void main(String[] args) {
        System.out.println(Duration.ofHours(10).toMinutes());   // 10 hours expressed in minutes: 600
// In the example below, the difference in minutes between the current time and the time 2 days later is calculated
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes()); // 2880
// The number of months between the two dates is calculated below
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(100)).getMonths());         // 3

        System.out.println(Duration.ofHours(300).toDays());
    }
}
