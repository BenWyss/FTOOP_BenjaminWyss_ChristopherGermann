package Berechnung_von_Pi;

/**
 * Berechnung von Pi
 *
 * Diese Klasse enthält die Methode 'calculatePi', welche mithilfe des Monte-Carlo-Algorithmus
 * Pi berechnet, bzw. sich diesem annähert.
 *
 * @author Benjamin Wyss & Christopher Germann
 * @version 1.00
 **/

public class Pi {

    /**
     * Methode calculatePi
     *
     * Diese Methode berechnet Pi mit dem Monte-Carlo-Algorithmus.
     *
     * @param numberOfPoints = die Anzahl Punkte, welche im Kreis gesetzt werden sollen.
     * @return Returniert die Abweichung der Monte-Carlo-Pi zu Pi.
     *
     */

    public static Double calculatePi(int numberOfPoints) {

        // Diese Variable dient zum zähle wieviele Punkte sich im Kreis befinden.
        int pointsInsideTheCircle = 0;
        // Um die Punktkoordinaten bestimmen zu können benötigen wir eine x-, sowie eine y-Koordinate.
        double xCoordinate, yCoordinate;

        // Generiert Punkte mit zufälligen x- und y-Koordinaten.
        for (int i = 1; i <= numberOfPoints; i++) {
            xCoordinate = Math.random();
            yCoordinate = Math.random();

            // Falls sich der Punkt im Kreis befindet wird pointsInsideTheCircle um eins erhöht.
            if (Math.hypot(xCoordinate, yCoordinate) <= 1) {
                pointsInsideTheCircle += 1;
            }
        }
        // Die Näherungsgleichung wird hier angewendet: Pi = (4 * PunkteImKreis) / Anzahl Punkte
        double monteCarlosPi = 4 * (double) pointsInsideTheCircle / numberOfPoints;

        // Ausgabe der Daten in der Konsole
        System.out.printf("%d Punkte, davon %d Punkte im Viertelkreis, dementsprechend ist Pi etwa %g%n",numberOfPoints,pointsInsideTheCircle,monteCarlosPi);

        // Abweichung zwischen Monte-Carlo-Pi zu Pi berechnen
        Double abweichung = Math.abs(((Math.PI - monteCarlosPi) / Math.PI) * 100);

        //Ausgabe der Abweichung in der Konsole
        System.out.printf("Abweichung: %.2f%% \n", abweichung);

        // Return der Abweichung
        return abweichung;
    }
}
