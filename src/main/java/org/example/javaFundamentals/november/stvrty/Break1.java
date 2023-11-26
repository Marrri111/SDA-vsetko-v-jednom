package org.example.javaFundamentals.november.stvrty;

public class Break1 {
    public static void main(String[] args) {
        int n = 100;
        int m = 6;
        //find x >= m, n % x == 0
        for (int i = m; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Found " + i);
                break;//nebude už hľadať ďalšie čísla
            } else {
                System.out.println(i + " did notmpass");
            }
        }
    }
}
