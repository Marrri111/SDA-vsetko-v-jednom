package org.example.javaFundamentals.cvicenia;

import java.util.Arrays;

public class RleEncoder {
    public static void main(String[] args) {
        //aaaaannnrlll
        //a#5n#3rl#3
        String input = "aaaaannnrlll";
        //your code
        String output;// = "a#5n#3rl#3"

        char prew = input.charAt(0);
        int sameCount = 1;
        String codedString = "";
        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == prew) {//
                sameCount++;
            } else {
//                if(sameCount > 1){
//                    codedString += prew + "#" + sameCount;
//                }else{
//                    codedString +=prew;
//                }
                codedString += sameCount > 1 ? prew + "#" + sameCount : prew;

                prew = input.charAt(i < input.length() ? i : i - 1);
                sameCount = 1;
            }
        }
        System.out.println(codedString);
    }

    private static String composeByte(byte b, int count) {
        byte[] array = new byte[count];
        Arrays.fill(array, b);
        return new String(array);
    }
}
