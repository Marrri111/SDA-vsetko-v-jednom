package org.example.javaFundamentals.november.jedenasty;

import java.util.Random;

public class Metods2 {
    public static void main(String[] args) {
        System.out.println(10 % 3);
        int aaa = rest(13, 3);
        System.out.println(aaa);

        System.out.println(random());

        int del = 3;
        int d = 2;
        int vys = rest(del,d);
        System.out.println(div(3,2));
        int cons = returnedNumberExample();
        System.out.println(cons);
    }
    static int random(){
        int i = new Random().nextInt(1,5);
        return i;
    }
    static int rest(int delenec, int delitel) {
        int r = delenec % delitel;
        return r;
    }
    static double div(int a, int b){
        return (double) a/b;//je to jednoduché na výpočet, tak to viem urobiť aj takto
        //nemusím vracať len premennú, dá sa vrátiť aj výraz
        //v zátvorke je double z toho dôvodu, že to chceme mať desatinné číslo
    }
    static int returnedNumberExample() {
        return 5;
    }
}

