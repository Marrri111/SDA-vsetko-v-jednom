package org.example.javaFundamentals.november.dvanasty;

public class Ternar2 {
    public static void main(String[] args) {
        // || &&



        boolean aa = true || false;
        boolean b1 = 1 < 2;
        boolean b2 = 1 == 2;
        boolean ahoj = "ahoj".equals("ahoj");

        int number = 4;
        // podminka ? vyraz pro true : vyraz pro false
        // (())
        String s = number == 0 ? "nula" : (number < 0 ? "zaporne" : "kladne");

        String operator="*";
        int a = 3;
        int b = 2;
        int vysledek = operator.equals("+") ? a + 1 : (operator.equals("-") ? a - b : (operator.equals("*") ? a * b : a / b));
        System.out.println(vysledek);

        if(a==4 && b++ == 20){ //&& || zkracene vyhodnoceni
           //...something
        }
        System.out.println(b);//2

        if(a==4 & b++ == 20){ // & | uplne vyhodnoceni
            //...something
        }
        System.out.println(b);//3
    }
}
