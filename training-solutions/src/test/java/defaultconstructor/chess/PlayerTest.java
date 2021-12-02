package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player = new Player();

    @Test
    void setName() {
        player.setName("Nagy Sándor");
        assertEquals("Nagy Sándor", player.getName());
    }

    @Test
    void setEmail() {
        player.setEmail("nagy@sandor.hu");
        assertEquals("nagy@sandor.hu", player.getEmail());
    }
}