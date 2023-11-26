package org.example.javaFundamentals.november.piaty;

public class MinimalForLoop {
    public static void main(String[] args) {
        //for(;;){} takto viem zadefinovať for, bez akejkoľvek podmienky
        for (int i = 0; true; i++) {
            if (i > 10) {
                break;
            }
        }
    }
}
