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

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        Die die1 = new Die(); //initialiserer instance af terningen.
        Die die2 = new Die();

        Player player1 = new Player();
        Player player2 = new Player();

        Game game = new Game();
        game.theGame(player1, player2, die1, die2);
    }
}
