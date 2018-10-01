package spil;

// import sun.applet.Main;

import java.util.Random;
import java.lang.Math;

/**
 * @author Gruppe 15
 * Navn og studienummer:
 * Karl Emil Jeppesen       s180557
 * Alfred Röttger Rydahl    s160107
 * Said Abdullahi           s185013
 * Søren Poulsen            s180905
 * Rasmus Sander Larsen     s185097
 * Noah F. M. Hamza         s185084
 * Dato: 24-09-2018
 * SWT/ITØ Danmarks Tekniske Universitet
 */

public class Die {

    int FaceValue;
    int[] faces = {0,0,0,0,0,0};

    /**
     * Denne funktion tester en terning mod et antal kast med Chi2 testen.
     *
     * @param rolls
     * @return
     */
    public boolean DieCheck (int rolls) {
        boolean valid = false;
        double exp = rolls/6.0;
        double chi2[] = {0,0,0,0,0,0};
        double ChiCrit = 11.070; //critical value for df = 5 chi-squared.

        for (int j = 0; j < rolls; j++){
            roll();
        }

        for (int i = 0; i <= 5; i++) {
            chi2[i] = ((faces[i]-exp)*(faces[i]-exp))/exp;
        }

        double chiSum = chi2[0]+chi2[1]+chi2[2]+chi2[3]+chi2[4]+chi2[5];

        if (chiSum < ChiCrit) {
            valid = true;
        }
        return valid;
    }

    /**
     *
     */
    public void roll() {        //Denne funktion 'kaster' terningen og sætter dens 'FaceValue' til den slåede værdi.
        FaceValue = (int)(Math.random()*6) + 1;
        DieSwitch(FaceValue);
        }

    /**
     *
     * @param value
     */
    public void DieSwitch (int value) {     //Denne funktion noterer hvor mange gange et tal er slået.
        switch (value) {
            case 1:
                faces[0] = faces[0]+1;
                break;
            case 2:
                faces[1] = faces[1]+1;
                break;
            case 3:
                faces[2] = faces[2]+1;
                break;
            case 4:
                faces[3] = faces[3]+1;
                break;
            case 5:
                faces[4] = faces[4]+1;
                break;
            case 6:
                faces[5] = faces[5]+1;
                break;
            default:
                break;
        }
    }

}