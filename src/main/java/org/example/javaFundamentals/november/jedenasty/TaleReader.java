package org.example.javaFundamentals.november.jedenasty;

public class TaleReader {
    public static void main(String[] args) {
        Tale karkulka = new Tale();//toto je objekt s názvom karkulka
        //objekt je instance(copies) triedy
        //karkulka.nazev = "Karkulka";
        //karkulka.autor = "Grimm";
        //karkulka.content = "Byla jednou jedna malá holčička, kterou všichni nazývali Karkulka.";

        karkulka.setNazev("Karkulka");
        karkulka.setAutor("Grimm");
        karkulka.setContent("Byla jednou jedna malá holčička, kterou všichni nazývali Karkulka.");


        Tale dasenka = new Tale();
        dasenka.setNazev("Dášenka");
        dasenka.setAutor("Čapek");
        dasenka.setContent("Dášenka byla malá kachnička, ..");

        Tale p3 = new Tale("Nemo", "Disney", "plavala rybicka");

        Tale[] tales = new Tale[]{karkulka, dasenka};
        for (Tale t : tales) {//do premennej t mi každým priechodom cyklu ulož jednu položku z pole
            System.out.println(t.getNazev());//vypíš mi jej názov
        }

        System.out.println(karkulka.sayTale());
        System.out.println(dasenka.sayTale());
        System.out.println(p3.sayTale());
        System.out.println(new Tale("Marenka").sayTale());
    }
}
