package spil;
import java.util.Scanner;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 27-09-2018
 * University: DTU
 */
public class Turn {

    Scanner scanner = new Scanner(System.in);
    String input;

    public void turn (Player player, Die die1, Die die2) {
        System.out.println("Press 'r' to roll dice for "+player.name);
        input = scanner.next();
        die1.roll();
        die2.roll();

        System.out.println("You rolled "+die1.getFaceValue()+" and "+die2.getFaceValue());
        player.score=player.score+die1.getFaceValue()+die2.getFaceValue();
        if (die1.getFaceValue() == 1 && die2.getFaceValue() == 1) {
            player.score = 0;
            System.out.println("You rolled two ones and your score has been reset");
        } else if (die1.getFaceValue() == die2.getFaceValue()) {
            System.out.println("You rolled two similar and get an extra turn!");
            turn(player, die1, die2);
        }

    }

}
