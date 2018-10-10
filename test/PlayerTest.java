import static org.junit.Assert.*;
import spil.*;

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
        player.setName("DTU");
        assertEquals("DTU",  player.getName());
    }

    @org.junit.Test
    public void PlayerScore() {
        player.setScore(30);
        assertEquals(30, player.getScore());
    }

}