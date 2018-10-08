package spil;

import java.util.Scanner;
//import sun.applet.Main;


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

    Scanner scanner = new Scanner(System.in); // Loads Scanner and naming it "scanner"

    public void theGame (Player player1, Player player2, Die die1, Die die2){

        Turn turn1 = new Turn(); // Loads Turn and naming it "turn1"

        System.out.println("Type first players name:"); // Print out "Type first players name"
        player1.name = scanner.next(); // Loads input from keyboard and loads it into player1.name
        System.out.println("Type seconds players name:"); // Print out "Type seconds"
        player2.name = scanner.next(); // Loads input from keyboard and loads it into player2.name

        while (player1.score <= 40 && player2.score <= 40) { // As long as player1 & player2 has a score below or equal to 40 we will run the loop below

            turn1.turn(player1, die1, die2); // Run turn1 on player1 with die1 and die2
            System.out.println("Your score is "+player1.score+"\n"); // Print out the score of player1

            turn1.turn(player2, die1, die2); // Run turn1 on player2 with die1 and die2
            System.out.println("Your score is "+player2.score+"\n"); // Print out the score of player2

        }

        /*
        Now the score of at least one of the two players is 40 or more.
        The while loop below check if player1 and player2's scores are the same and if they are
        we will run the code in while loop below.
         */

        while (player1.score == player2.score) {

            turn1.turn(player1, die1, die2); // Run a turn on player1
            System.out.println("Your score is "+player1.score+"\n"); // Print out score of player1

            turn1.turn(player2, die1, die2); // Run a turn on player2
            System.out.println("Your score is "+player2.score+"\n"); // Print out score of player2

        }

        /*
        If player1 and player2 is above or equal to 40 and the scores of player1 and player2 is NOT the same.
        We have a winner which is specified below.
         */

        if(player1.score>player2.score){ // Player1 score is higher that player2 score. Player1 won!
        System.out.printf(player1.name+" won!"); // Print out that "player1.name won"
        }else{ // If player1 score if not higher than player2. Player2 won!
        System.out.printf(player2.name+" won!"); // Print out that "player2.name won"
        }

    }

}