package org.example.javaFundamentals.november.dvadsiatypiaty;

import java.time.LocalTime;

public class DateTime1 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("Now is the time: " + localTime);    // Now is the time: 22:34:27.106


        LocalTime localTime2 = LocalTime.now()
                .withSecond(0)                                  // set the seconds to 0
                .withNano(0);                                   // set the nanoseconds to 0
        System.out.println("Now is the time: " + localTime2);

        LocalTime now = LocalTime.now();
        System.out.println("Now is the time: " + now);          // Now is the time: 22:49:01.241
        now = now.plusMinutes(10).plusHours(1);
        System.out.println("Now is the changed time: " + now);

        System.out.println(LocalTime.of(10, 30).plusHours(3));
    }
}
