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

    /*
    -------------------------------------------------------------------------------------------
    Fields
     */

    private int FaceValue;
    private int[] faces = {0,0,0,0,0,0};



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

    /*
    -------------------------------------------------------------------------------------------
    Properties
     */

    public int getFaceValue() {
        return FaceValue;
    }

    public void setFaceValue(int faceValue) {
        FaceValue = faceValue;
    }

    public int[] getFaces() {
        return faces;
    }
}