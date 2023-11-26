package org.example.javaFundamentals.oktober.dvadsiatydruhy;

public class LogicOperators {
    public static void main(String[] args) {
        boolean koupitKolo;
        boolean jeHodne = true;
        boolean mamPenize = false;
        koupitKolo = jeHodne && mamPenize;
        System.out.println(koupitKolo);

        mamPenize = true;
        koupitKolo = jeHodne && mamPenize; //logické a
        System.out.println(koupitKolo);

        boolean pujduVen;
        boolean potrebujuNakoupit = true;
        boolean musimKDoktorovi = false;
        pujduVen = potrebujuNakoupit || musimKDoktorovi; //logické alebo
        System.out.println(pujduVen);

        boolean jeZlobive = !jeHodne;
        System.out.println(jeZlobive);
    }
}
