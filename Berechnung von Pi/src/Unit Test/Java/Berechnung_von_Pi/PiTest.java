package Berechnung_von_Pi;

import org.junit.Test;

import static org.junit.Assert.*;

public class PiTest {

    @Test
    public void calculatePi() throws Exception {
        assertTrue(5 >= Pi.calculatePi(10000000));
    }

    @Test
    public void negativeCalculatePi() throws Exception {
        assertFalse(5 >= Pi.calculatePi(5));
    }

}