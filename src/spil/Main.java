package spil;

import spil.Die;
import java.util.Scanner;

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

public class Main {

    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        Die die1 = new Die(); //initialiserer instance af terningen.
        Die die2 = new Die();

        if (die1.DieCheck(10000)) { //test af en terning genne Chi2 test.
            System.out.println("The tested dice is true.");
        } else {
            System.out.println("The tested dice is false.");
        }

        Player player1 = new Player();
        Player player2 = new Player();

        Game game = new Game();
        game.theGame(player1, player2, die1, die2);

}

    /*
    private int getSum(Die one, Die two) {
        sum = roll.one+roll.two;
        return sum;
    } //returnerer summen af øjnene

    private boolean getEns(Die one, Die two) {
        if (roll.one == roll.two) {
            equal = true;
        }
        return equal;
    } //returnerer on øjnene er ens

    //setDice(int, int) //placerer terninger med angivet værdi
    */
}