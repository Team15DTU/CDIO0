package spil;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 26-09-2018
 * University: DTU
 */
public class Player {

    /*
    ------------------------------------------------------------------------------
    Fields
     */

    private String name;                    // Name for player
    private int score;                      // Score for player
    private boolean winningTicket = false;  // If player rolled 2x6 last turn
    boolean hasWon = false;                 // If player has won


    /*
    ------------------------------------------------------------------------------
    Properties
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isWinningTicket() {
        return winningTicket;
    }

    public void setWinningTicket(boolean winningTicket) {
        this.winningTicket = winningTicket;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }
}
