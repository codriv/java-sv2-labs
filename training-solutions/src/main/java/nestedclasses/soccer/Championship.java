package nestedclasses.soccer;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    private List<TeamStatistics> leagueTable = new ArrayList<>();

    public List<TeamStatistics> getLeagueTable() {
        return leagueTable;
    }

    public void addGame(GameResult result) {
        TeamStatistics teamHome = findTeamByName(result.teamHome);
        TeamStatistics teamGuest = findTeamByName(result.teamGuest);
        setStatistics(teamHome, result.teamHome, result.goalHome, result.goalGuest);
        setStatistics(teamGuest, result.teamGuest, result.goalGuest, result.goalHome);
    }

    private void setStatistics(TeamStatistics team, String teamName, int goalHome, int goalGuest) {
        if (team == null) {
            team = new TeamStatistics(teamName);
            leagueTable.add(team);
        }
        team.played(goalHome, goalGuest);
    }


    private TeamStatistics findTeamByName(String teamName) {
        for (TeamStatistics team: leagueTable) {
            if (teamName.equals(team.getTeamName())) {
                return team;
            }
        }
        return null;
    }

    public static class GameResult {

        private String teamHome;
        private String teamGuest;
        private int goalHome;
        private int goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }
}
