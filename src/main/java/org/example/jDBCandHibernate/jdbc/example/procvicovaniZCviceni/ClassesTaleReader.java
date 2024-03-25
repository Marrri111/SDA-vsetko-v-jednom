package org.example.jDBCandHibernate.jdbc.example.procvicovaniZCviceni;


public class ClassesTaleReader {
    public static void main(String[] args) {

        ClassesTale p1 = new ClassesTale();
        p1.setNazev("Karkulka");
        p1.setAutor("Grim");
        p1.setContent("GZ uf eftufgt fg ef uuefgu gv. f ufuegtugfvurufgbbvv. ecfi hfiu");

        ClassesTale dasenka = new ClassesTale();
        dasenka.setNazev("Dasenka");
        dasenka.setAutor("Capek");
        dasenka.setContent("Fudgwurgew dguefcuefcfc. Ffdh dfuewwgbgcf csugufcg. Gufeh fv vcv dd.");

        //   System.out.println(p1.nazev + " " + p1.autor + ": " + p1.content);
        //   System.out.println(dasenka.nazev + " " + dasenka.autor + ": " + dasenka.content);

        System.out.println(p1.sayTale());
        System.out.println(dasenka.sayTale());
    }
}
