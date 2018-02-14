package Berechnung_von_Pi;

public class Pi {

    public static Double calculatePi(int numberOfPoints) {

        int pointsInsideTheCircle = 0;
        double xCoordinate, yCoordinate;

        for (int i = 1; i <= numberOfPoints; i++) {
            xCoordinate = Math.random();
            yCoordinate = Math.random();

            if (Math.hypot(xCoordinate, yCoordinate) <= 1) {
                pointsInsideTheCircle += 1;
            }
        }
        double monteCarlosPi = 4 * (double) pointsInsideTheCircle / numberOfPoints;

        System.out.printf("%d Punkte, davon %d Punkte im Viertelkreis, dementsprechend ist Pi etwa %g%n",numberOfPoints,pointsInsideTheCircle,monteCarlosPi);

        Double abweichung = Math.abs(((Math.PI - monteCarlosPi) / Math.PI) * 100);

        System.out.printf("Abweichung: %.2f%% \n", abweichung);
        return abweichung;
    }
}
