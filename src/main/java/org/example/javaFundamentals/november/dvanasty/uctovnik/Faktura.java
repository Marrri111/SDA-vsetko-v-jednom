package org.example.javaFundamentals.november.dvanasty.uctovnik;

import java.time.LocalDate;

public class Faktura {
    //fieldy private!
    int castka;

    int typ; //1 znamena prijate, 2 vystavene
    LocalDate datumSplatnosti;
    String predmet;
    LocalDate datumZaplaceni;

    public boolean jeZaplacenoVcas(){
        return datumSplatnosti.isBefore(datumZaplaceni);
    }
}
