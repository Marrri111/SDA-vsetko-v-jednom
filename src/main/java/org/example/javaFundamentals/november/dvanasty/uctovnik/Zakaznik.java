package org.example.javaFundamentals.november.dvanasty.uctovnik;

public class Zakaznik {
    private Ucet ucet;
    Faktura[] faktury;

    public Faktura vratPrvniPoSplatnosti(){
        for(Faktura f: faktury){
            if(!f.jeZaplacenoVcas()){
                return f;
            }
        }
        return null;
    }
}
