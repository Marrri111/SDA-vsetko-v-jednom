package org.example.jDBCandHibernate.jdbc.example.procvicovaniZCviceni;

public class MethodCviceni {
    public static void main(String[] args) {
        System.out.println(pow2(2)); //4

        System.out.println(pow(2, 3)); //8

        System.out.println(printArray(new int[]{1, -2, 3})); //[1, 2, 3]
    }

    static int pow2(int a) {
        return a * a;
    }

    static int pow(int a, int b) {

        int c = 1;

        for (int i = 0; i < b; i++) {
            c *= a;
        }
        return c;
    }

    private static String printArray(int[] ints) {
        String res = "[";

        for (int i : ints) {
            if (i < 0) {
                i = (i * -1);
            }

            res += i;
            res += ", ";
        }
        return res.substring(0, res.length() - 2) + "]";

    }

}

