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
     * Methode printPrimenumbers
     *
     * Diese Methode berechnet alle Primzahlen zwischen 2 und 100 und returniert diese als ArrayList
     *
     * @return returniert eine ArrayList mit allen Primzahlen von 2 bis 100
     */

    public static ArrayList<Integer> printPrimenumbers() {
        //Zunächst werden alle Zahlen 2, 3, 4,… bis zu einem frei wählbaren Maximalwert aufgeschrieben
        int maxNumber = 100;

        // Legt eine neue Liste an
        ArrayList<Boolean> numberList = new ArrayList<>();
        ArrayList<Integer> primeNumberList = new ArrayList<>();

        // Füllt die neue Liste mit lauter true-Elementen
        for (int i = 0; i <= maxNumber; i++) {
            numberList.add(i, true);
        }

        for (int i = 2; i <= maxNumber; i++) {

            if (numberList.get(i)) {
                int j = i;
                do {
                    j += i;
                    if (j <= maxNumber) {
                        // Ist die Zahl ein Vielfaches einer 
                        // Primzahl, dann wird sie mit false 
                        // markiert
                        numberList.set(j, false);
                    }
                } while (j <= maxNumber);
            }
        }

        //Lies alle Primzahlen (true) des Arrays aus
        for (int i = 0; i <= maxNumber - 1; i++) {
            if (numberList.get(i) && i > 1) {
                primeNumberList.add(i);
                System.out.print(i + " ");
            }
        }
        return primeNumberList;
    }
}
