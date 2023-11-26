package org.example.javaFundamentals.november.jedenasty;

public class TaleReader {
    public static void main(String[] args) {
        Tale p1 = new Tale();
        p1.nazev = "Karkulka";
        p1.autor = "Grimm";
        p1.content = "Byla jednou jedna malá holčička..";

        Tale dasenka = new Tale();
        dasenka.nazev = "Dášenka";
        dasenka.autor = "Capek";
        dasenka.content = "Dášenka byla malá kachnička, ..";

        System.out.println(p1.sayTale());
        System.out.println(dasenka.sayTale());
    }
}
