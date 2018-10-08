package spil;

import static org.junit.Assert.*;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 29-09-2018
 * University: DTU
 */
public class PlayerTest {

    Player player = new Player();

    @org.junit.Test
    public void PlayerName() {
        player.name = "DTU";
        assertEquals("DTU",  player.name);
    }

    @org.junit.Test
    public void PlayerScore() {
        player.score = 30;
        assertEquals(30, player.score);
    }

}