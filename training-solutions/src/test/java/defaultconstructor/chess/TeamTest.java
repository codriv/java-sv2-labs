package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    Team team = new Team();
    Player player1 = new Player();
    Player player2 = new Player();

    @Test
    void setPlayerOne() {
        team.setPlayerOne(player1);
        assertSame(player1, team.getPlayerOne());
    }

    @Test
    void setPlayerTwo() {
        team.setPlayerTwo(player2);
        assertSame(player2, team.getPlayerTwo());
    }
}