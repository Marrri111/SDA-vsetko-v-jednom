package org.example.javaFundamentals.november.piaty;

public class Array1 {
    public static void main(String[] args) {
        int[] intArray = new int[4];//{0,0,0,0}
        int[] intArray2 = new int[]{3, 5, 8, 9};//poradie sa počíta 0,1,2,3
        // to znamená, že 3 je na mieste 0, 5 je na 1 mieste....
        boolean[] bo = new boolean[]{false, false, true};
        boolean[] bo2 = new boolean[2];

        String[] sa1 = new String[]{"ahoj", "jak", "se mas"};
        String[] sa2 = new String[3];//{null,null,null}

        int firstItem = intArray2[0]; //firstItem will be 3
        int LastItem = intArray2[intArray2.length - 1]; //-1 je tam preto, že pole má dlžku 4, ale posledná hodnota je na mieste 3

        sa2[0] = "ahoj";
        sa2[1] = "ahoj2";
        sa2[2] = sa1[1];//zadá sa tam jak
    }
}
