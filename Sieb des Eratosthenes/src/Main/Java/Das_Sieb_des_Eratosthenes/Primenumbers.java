package Das_Sieb_des_Eratosthenes;

import java.util.ArrayList;

public class Primenumbers {

    public static void printPrimenumbers() {
        //Zunächst werden alle Zahlen 2, 3, 4,… bis zu einem frei wählbaren Maximalwert aufgeschrieben
        int maximalWert = 100;
        // Legt eine neue Liste an
        ArrayList<Boolean> zahlenListe = new ArrayList<Boolean>();

        // Füllt die neue Liste mit lauter true-Elementen
        for (int i = 0; i <= maximalWert; i++) {
            zahlenListe.add(i, true);
        }

        for (int i = 2; i <= maximalWert; i++) {

            if (zahlenListe.get(i)) {
                int j = i;
                do {
                    j = j + i;
                    if (j <= maximalWert) {
                        // Ist die Zahl ein Vielfaches einer 
                        // Primzahl, dann wird sie mit false 
                        // markiert
                        zahlenListe.set(j, false);
                    }
                } while (j <= maximalWert);
            }
        }

        for (int i = 0; i <= maximalWert - 1; i++) {
            if (zahlenListe.get(i) && i > 1) {
                System.out.print(i + " ");
            }
        }
    }
}
