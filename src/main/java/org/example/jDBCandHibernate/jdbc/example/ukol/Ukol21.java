package org.example.jDBCandHibernate.jdbc.example.ukol;

public class Ukol21 {

    public static String[] main(String[] table) {

        String[] out = new String[table.length]; // Vytvoření nového pole (out), které bude obsahovat unikátní prvky z původního pole.

        int k = 0;

        for (int i = 0; i < table.length; i++) {
            boolean found = false; // zda byl prvek nalezen v poli - false nebyl

            /* Kontroluje, zda je aktuální prvek z table již obsažen v out. */
            for (int j = 0; j < out.length; j++) {
                if (table[i].equals(out[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                out[k++] = table[i];
            }
        }
        return out;

    }

}
