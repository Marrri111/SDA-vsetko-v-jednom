package org.example.javaFundamentals.november.dvadsiatypiaty;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat1 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        String formattedLocalTime = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(formattedLocalTime); // 21:11:00.024

        System.out.println(localTime.format(DateTimeFormatter.ofPattern("hh:mm-ss")));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.plusHours(-1).format(DateTimeFormatter.ofPattern("dd.MM.yyyy ww- hh:mm.SSSS")));
    }
}
