package org.example.javaFundamentals.oktober.dvadsiatydeviaty;

public class Cast1 {
    public static void main(String[] args) {
        int a = 10;
        float b = a;//pretypovanie premennej z intovej na float a priradenie jej hodnoty
        System.out.println(b);

        byte c = (byte) a; //domalej byte hodnoty nemôžem jednoducho zadať intovú hodnotu
        // do zátvoriek pred a musím dať typ premennej, ktorú budem chcieť
        float d = 11.9F;
        int e = (int) d;   //to isté ako pri byte
        // tú premennú e urobí z d spôsobom, že len oreže to, čo je za desatinnou čiarkou
        System.out.println(e);
        int f = Math.round(d); //zaokrúhľovanie podľa matematických pravidiel
        System.out.println(Math.round(d)); //viem v procese urobiť zaokrúhlenie aj takto
        System.out.println(f); //ak si urobím premennú na zaokrúhlenie, tak takto
    }
}
