package org.example.javaFundamentals.november.piaty;

public class CharsExample {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println(97 == a);
        System.out.println(a);
        System.out.println(97);
        System.out.println((char) 97);//pretypovávam
        System.out.println((int) 'a');//takýmto spôsobom viem zistiť akú hodnotu ascii má daný znak
        //každý znak (char je číselný typ) má nejakú číselnú hodnotu
    }
}
