package org.example.javaFundamentals.oktober.dvadsiatydruhy;

public class String2 {
    public static void main(String[] args) {
        String multiLine = "M,\nT,\nW";
        System.out.println(multiLine);
        String multiLine2 = """
                M,
                T,
                W
                """; // tri úvodzovky mi urobia nové riadky, platí to iba pri stringu
        System.out.println(multiLine2);
    }
}
