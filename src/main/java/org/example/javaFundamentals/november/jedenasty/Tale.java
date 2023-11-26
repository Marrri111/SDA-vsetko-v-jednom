package org.example.javaFundamentals.november.jedenasty;

public class Tale {
    String nazev;
    String autor;
    String content;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNazev(String n) {
        nazev = n;
    }

    public String sayTale() {
        return nazev + "\n" + autor + ":" + content + "\n";
    }

}
