package spil;


import java.util.Random;

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
    ----------------------------------- Fields  -----------------------------------
    Private int faceValue hold the value (number of eyes) of the die.
    Private int array used for counting number of times of each faceValue is rolled.
     */

    private int faceValue;
    private int[] faces = {0,0,0,0,0,0};


    /**
     *
     */
    public void roll() { // This function acts as the roll of the die

        Random generator = new Random(); // Creates an Random and naming it "generator"

        faceValue = generator.nextInt(6) + 1; // Greats a random number from 1-6 and loads it into faceValue
        DieSwitch(faceValue); // Sends faceValue to DieSwitch for counting of FaceValues.
        }

    /**
     *
     * @param value
     */

    public void DieSwitch (int value) { // This function counts the amount of times each faceValue is rolled.
        switch (value) {
            case 1:
                faces[0] = faces[0]+1; // If the faceValue "1" is rolled, place 0 in the face Array is increased with 1
                break;
            case 2:
                faces[1] = faces[1]+1; // If the faceValue "2" is rolled, place 1 in the face Array is increased with 1
                break;
            case 3:
                faces[2] = faces[2]+1; // If the faceValue "3" is rolled, place 2 in the face Array is increased with 1
                break;
            case 4:
                faces[3] = faces[3]+1; // If the faceValue "4" is rolled, place 3 in the face Array is increased with 1
                break;
            case 5:
                faces[4] = faces[4]+1; // If the faceValue "5" is rolled, place 4 in the face Array is increased with 1
                break;
            case 6:
                faces[5] = faces[5]+1; // If the faceValue "5" is rolled, place 5 in the face Array is increased with 1
                break;
            default:
                break; // Breaks out of switch as default
        }
    }

    /*
    -------------------------------------------------------------------------------------------
    Properties

     */

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public int[] getFaces() {
        return faces;
    }
}