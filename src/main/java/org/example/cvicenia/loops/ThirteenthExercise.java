package org.example.cvicenia.loops;

public class ThirteenthExercise {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 5; i <= 460 * 2 + 1; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);

        int sum1 = 0;
        for (int i = 5; i <= 5 + 2 * (459 - 1); i += 2) {
            sum1 += i;
        }
        System.out.println("Sum = " + sum1);
        /*Počiatočná hodnota i: Začína sa s i = 5,
        čo je prvý člen postupnosti.
        Zvýšenie hodnoty i: Používa sa i += 2 v každej iterácii,
        čo znamená, že sa presúvate na ďalší člen aritmetickej
        postupnosti, a keďže spoločný rozdiel je 2,
        správne sa presúvate na každý člen postupnosti.
        Počet iterácií (460): Chcete sčítať 459 prvkov a keďže
        cyklus začína s prvým členom (i = 5), musíte cyklus
        spustiť až kým neobsiahne 459 prvkov. Preto používate
        460 * 2 + 1 ako horný limit.
        Rozoberme si výraz 460 * 2 + 1:
        460 * 2: Týmto vypočítate počet prvkov postupnosti
        (bez počiatočného člena) násobený spoločným rozdielom (2).
        + 1: Týmto sa zohľadní počiatočný člen (i = 5), aby ste ho
        zahrnuli do cyklu. Takže podmienka i <= 460 * 2 + 1
        zabezpečuje, aby cyklus spracoval prvý člen a ďalších
        459 prvkov v aritmetickej postupnosti.
        Alternatívnym spôsobom vyjadrenia tej istej podmienky
        je i <= 5 + 2 * (459 - 1), čo vychádza z faktu, že medzi
        prvým členom (5) a posledným členom postupnosti
        (5 + 2 * (459 - 1)) je 459 krokov. Táto formulácia robí
        zámer spracovať 459 prvkov explicitnejším spôsobom.*/
    }
}
