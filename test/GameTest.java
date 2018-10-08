package spil;

import org.junit.Test;
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 29-09-2018
 * University: DTU
 */
public class GameTest {

    Game game = new Game();
    Player player1 = new Player();
    Player player2 = new Player();
    Die die1 = new Die();
    Die die2 = new Die();

    @Test
    public void theGame() {

    for (int i = 0; i < 10; i++) {
        player1.name = "DTU";
        player2.name = "CBS";
        game.theGame(player1, player2, die1, die2);
        assertFalse(player1.score != 0);
    }
    }
}