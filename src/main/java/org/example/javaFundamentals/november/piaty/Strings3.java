package org.example.javaFundamentals.november.piaty;

public class Strings3 {
    public static void main(String[] args) {
        String greating = "Hello world!";
        greating.contains("wo");//true
        int wo1 = greating.indexOf("wo");
        String substring = greating.substring(wo1);
        System.out.println(substring);//world!
        System.out.println(greating.substring(wo1, greating.length() - 1));//world

        String text = "Hahaha! Funny joke!";
        System.out.println(text.replaceAll("a", "o"));//nahradí mi všetky ačka očkom, ale iba na tomto mieste, pôvodné mi nechá bez zmeny
        System.out.println(text);//tu vidíme pôvodné bez zmeny
    }
}
