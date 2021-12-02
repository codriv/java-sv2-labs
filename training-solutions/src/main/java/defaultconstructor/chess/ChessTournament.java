package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessTournament {
    private List<Team> teams;
    private List<Player> playersRegistrated = new ArrayList<>();

    public ChessTournament() {
        teams = Arrays.asList(new Team[3]);
    }

    public List<Player> getPlayersRegistrated() {
        return playersRegistrated;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        for (int i = 0; (i < 6 && i < playersRegistrated.size()); i += 2) {
            teams.set((i / 2), new Team());
            teams.get(i / 2).setPlayerOne(playersRegistrated.get(i));
            if (playersRegistrated.size() > i + 1) {
                teams.get(i / 2).setPlayerTwo(playersRegistrated.get(i + 1));
            }
        }
    }

    public void addPlayerToPlayersRegistrated(String name, String email) {
        Player player = new Player();
        player.setName(name);
        player.setEmail(email);
        playersRegistrated.add(player);
    }
}