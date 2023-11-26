package org.example.javaFundamentals.november.dvadsiatypiaty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a+bcd ");
        Matcher matcher = pattern.matcher("aaaaabcd kjdkejdkejk");
        boolean matches = matcher.matches();// returns true/false
        System.out.println(matches);
        System.out.println(matcher.find());

        System.out.println("nuber checking");
        Pattern pattern2 = Pattern.compile("[1-9]+[0-9]*");
        System.out.println(pattern2.matcher("01").matches());
        System.out.println(pattern2.matcher("1949474").matches());
        System.out.println(pattern2.matcher("1").matches());

        Matcher matcher1 = pattern2.matcher("ahoj 1 jak se mas 56 a dal nevim 4");
        while (matcher1.find()) {
            int finded = Integer.parseInt(matcher1.group());
            System.out.println(finded);
        }

        Pattern passPatt = Pattern.compile("[a-z]*[A-Z]+[a-z]*");//retezec musi obsahovat alespon 1 velke pismeno
        System.out.println(passPatt.matcher("abc").matches());

        Pattern emailP = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher2 = emailP.matcher("a.a@b.ss smeti kdkde fdef ja@seznam.cz");
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }
}
