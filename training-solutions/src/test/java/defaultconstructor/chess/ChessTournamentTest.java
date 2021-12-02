package defaultconstructor.chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {

    @Test
    void testAddPlayersToTeams() {
        ChessTournament chessTournament = new ChessTournament();
        chessTournament.addPlayerToPlayersRegistrated("Nagy Sándor", "nagy@sandor.hu");
        chessTournament.addPlayerToPlayersRegistrated("Kis Mari", "kis@mari.hu");
        chessTournament.addPlayerToPlayersRegistrated("Piros Alma", "piros@alma.hu");
        assertEquals(3, chessTournament.getPlayersRegistrated().size());
        chessTournament.addPlayersToTeams(chessTournament.getPlayersRegistrated());
        assertEquals("kis@mari.hu", chessTournament.getTeams().get(0).getPlayerTwo().getEmail());
    }

    @Test
    void testAddPlayersToTeamsMore() {
        ChessTournament chessTournament = new ChessTournament();
        chessTournament.addPlayerToPlayersRegistrated("Nagy Sándor", "nagy@sandor.hu");
        chessTournament.addPlayerToPlayersRegistrated("Kis Mari", "kis@mari.hu");
        chessTournament.addPlayerToPlayersRegistrated("Piros Alma", "piros@alma.hu");
        chessTournament.addPlayerToPlayersRegistrated("Zöld Piroska", "zold@piroska.hu");
        chessTournament.addPlayerToPlayersRegistrated("Fekete Péter", "fekete@peter.hu");
        chessTournament.addPlayerToPlayersRegistrated("Futaki Bátor", "futaki@bator.hu");
        chessTournament.addPlayerToPlayersRegistrated("Futó Álmos", "futo@almos.hu");
        assertEquals(7, chessTournament.getPlayersRegistrated().size());
        chessTournament.addPlayersToTeams(chessTournament.getPlayersRegistrated());
        assertEquals("kis@mari.hu", chessTournament.getTeams().get(0).getPlayerTwo().getEmail());
        assertEquals("Fekete Péter", chessTournament.getTeams().get(2).getPlayerOne().getName());
    }

    @Test
    void testAddPlayerToPlayersRegistered() {
        ChessTournament chessTournament = new ChessTournament();
        chessTournament.addPlayerToPlayersRegistrated("Nagy Sándor", "nagy@sandor.hu");
        chessTournament.addPlayerToPlayersRegistrated("Kis Mari", "kis@mari.hu");
        chessTournament.addPlayerToPlayersRegistrated("Piros Alma", "piros@alma.hu");
        assertEquals(3, chessTournament.getPlayersRegistrated().size());
    }
}