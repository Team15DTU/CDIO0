package spil;

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

public class Game {

    Scanner scanner = new Scanner(System.in); // Loads a Scanner and naming it "scanner"

    /*
    Runs the Game class on player1, player2, die1 and die2.
     */

    public void theGame (Player player1, Player player2, Die die1, Die die2){

        Turn turn1 = new Turn(); // Creates turn and naming it "turn1"

        System.out.println("Type first player name:"); // Print out "Type first player name:"
        player1.setName( scanner.nextLine() );  // Loads input from keyboard and loads it into player1.name

        System.out.println("Type second player name:"); // Print out "Type first player name:"
        player2.setName( scanner.nextLine() );  // Loads input from keyboard and loads it into player2.name

        /*
        Runs the while loop as long as player1.has and player2.hasWon == false
        OR
        player1.score and player.score is the same.
         */

        while ( (!player1.isHasWon() && !player2.isHasWon() ) || ( player1.getScore() == player2.getScore() && player1.isHasWon() == player2.isHasWon() )  ) {

            turn1.turn(player1, die1, die2); // Runs turn on player1, with die1 and die2
            System.out.println(player1.getName() + "'s score is "+player1.getScore()+"\n"); // Print out the name and score of player1

            turn1.turn(player2, die1, die2); // Runs turn on player1, with die1 and die2
            System.out.println(player2.getName() + "'s score is "+player2.getScore() +"\n"); // Print out the name and score of player2

        }


        if ( player1.isHasWon() == player2.isHasWon() ){ // If player1.hasWon is true the code below is executed.

            if ( player1.getScore() > player2.getScore() ) {
                System.out.println(player1.getName() + " won!"); // Print out the name of player1 and calls him the winner
            }


            else {
                System.out.println(player2.getName() + " won!"); // Print out the name of player1 and calls him the winner
            }

        }

        else if ( player1.isHasWon() ) { // If player2.hasWin is true the code below is executed.

            System.out.println(player1.getName() + " won!"); // Print out the name of player2 and calls him the winner
        }

        else if ( player2.isHasWon() ) {

            System.out.println(player2.getName() + " won!"); // Print out the name of player2 and calls him the winner
        }

    }

}