package org.example.jDBCandHibernate.jdbc.example.procvicovaniZCviceni;

public class ClassesTale {
    private String nazev;
    private String autor;
    private String content;

    public void setNazev(String n) {
        nazev = n;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String sayTale() {
        return nazev + "\n" +
                autor + ": " + content;
    }

}
