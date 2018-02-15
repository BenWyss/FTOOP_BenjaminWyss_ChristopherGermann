package Das_Sieb_des_Eratosthenes;

import java.util.ArrayList;

/**
 * Das Sieb des Eratosthenes
 *
 * Dies ist die Hauptklasse, welche die Methode "printPrimenumbers" enthält, welche die Primzahlen widergibt.
 *
 * @author Benjamin Wyss & Christopher Germann
 * @version 1.00
 **/

public class Primenumbers {

    /**
     * Introdcution
     *
     * <dl>
     * <dt><span class="strong"> Methode printPrimenumbers </span></dt>
     * <dd>Diese Methode berechnet alle Primzahlen zwischen 2 und 100 und returniert diese als ArrayList</dd>
     * </dl>
     * @return returniert eine ArrayList mit allen Primzahlen von 2 bis 100
     */

    public static ArrayList<Integer> printPrimenumbers() {
        //Zunächst werden alle Zahlen 2, 3, 4,… bis zu einem frei wählbaren Maximalwert aufgeschrieben
        int maximalWert = 100;

        // Legt eine neue Liste an
        ArrayList<Boolean> zahlenListe = new ArrayList<Boolean>();
        ArrayList<Integer> numberList = new ArrayList<>();

        // Füllt die neue Liste mit lauter true-Elementen
        for (int i = 0; i <= maximalWert; i++) {
            zahlenListe.add(i, true);
        }

        for (int i = 2; i <= maximalWert; i++) {

            if (zahlenListe.get(i)) {
                int j = i;
                do {
                    j += i;
                    if (j <= maximalWert) {
                        // Ist die Zahl ein Vielfaches einer 
                        // Primzahl, dann wird sie mit false 
                        // markiert
                        zahlenListe.set(j, false);
                    }
                } while (j <= maximalWert);
            }
        }

        //Lies alle Primzahlen des arrays aus
        for (int i = 0; i <= maximalWert - 1; i++) {
            if (zahlenListe.get(i) && i > 1) {
                numberList.add(i);
                System.out.print(i + " ");
            }
        }
        return numberList;
    }
}
