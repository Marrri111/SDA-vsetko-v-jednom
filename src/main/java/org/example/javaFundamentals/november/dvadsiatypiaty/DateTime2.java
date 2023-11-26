package org.example.javaFundamentals.november.dvadsiatypiaty;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;
public class DateTime2 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2020, Month.MARCH, 28, 20, 0, 10, 0);
        localDateTime = localDateTime.plusHours(72);
        System.out.println(localDateTime);      // 2020-03-28T20:00:10

        System.out.println(LocalTime.now(ZoneOffset.UTC));//ziskani casu v UTC ( cas na poledniku
    }
}
