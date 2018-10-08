package spil;

import org.junit.Test;
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

        assertEquals(true,  die.DieCheck(10000));
        assertEquals(false, die.DieCheck(5));
    }

    @org.junit.Test
    public void roll() {
        for (int h = 0; h < 10; h++) {
            die.roll();
            assertFalse(die.FaceValue == 0);
        }
        for (int h = 0; h < 10; h++) {
            die.roll();
            assertFalse(die.FaceValue == 7);
        }
    }

    @org.junit.Test
    public void dieSwitch() {
        die.FaceValue = 1;
        die.DieSwitch(die.FaceValue);
        assertEquals(die.faces[0],1);
    }
}