import org.junit.Test;
import spil.Die;

import static org.junit.Assert.*;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 27-09-2018
 * University: DTU
 */

    /*Kunden har bedt om en test. Vi vil foreslå, at I optæller antallet
    af forekomster for hver mulig værdi af summen (2-12). Optæl desuden
    antallet af kast, hvor terningerne er ens. Kontrollér at resultaterne
    stemmer overens med de teoretiske sandsynligheder.*/

public class DieTest {
    Die die = new Die();

    @org.junit.Test
    public void dieCheck() {

        // Determine how many times we want to roll the dice
        int rolls = 6000000;
        // Array to hold all the rolled values
        int[] faces = {0,0,0,0,0,0};

        boolean valid = false;
        double exp = rolls/6.0;
        double chi2[] = {0,0,0,0,0,0};
        double ChiCrit = 11.070; //critical value for df = 5 chi-squared.

        // Roll "rolls" times and put all the values into "faces"
        for (int j = 0; j < rolls; j++){
            roll();                         // Roll the dice
            faces[die.getFaceValue() - 1] += 1;  // Put value into array
        }

        for (int i = 0; i <= 5; i++) {
            chi2[i] = ((faces[i]-exp)*(faces[i]-exp))/exp;
        }

        for (int i : faces) {
            System.out.println(i);
        }

        double chiSum = chi2[0]+chi2[1]+chi2[2]+chi2[3]+chi2[4]+chi2[5];

        if (chiSum < ChiCrit) {
            valid = true;
        }

        assertTrue(valid);      // Check if valid is true
    }

    @org.junit.Test
    public void roll() {
        for (int h = 0; h < 10; h++) {
            die.roll();
            assertFalse(die.getFaceValue() == 0);
        }
        for (int h = 0; h < 10; h++) {
            die.roll();
            assertFalse(die.getFaceValue() == 7);
        }
    }

    @org.junit.Test
    public void dieSwitch() {
        die.setFaceValue(1);
        die.DieSwitch(die.getFaceValue());
        assertEquals(die.getFaces()[0],1);
    }
}