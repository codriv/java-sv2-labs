package nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {

    private String teamName;
    private int played;
    private int points;
    private Details details;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        details = new Details();
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPoints() {
        return points;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return details.won;
    }

    public int getTied() {
        return details.tied;
    }

    public int getLost() {
        return details.lost;
    }

    public int getGoalsfor() {
        return details.goalsFor;
    }

    public int getGoalsAgainst() {
        return details.goalsAgainst;
    }

    public class Details {
        private int won;
        private int tied;
        private int lost;
        private int goalsFor;
        private int goalsAgainst;
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        played++;
        details.goalsFor += plusGoalsFor;
        details.goalsAgainst += plusGoalsAgainst;
        setPoints(plusGoalsFor, plusGoalsAgainst);
    }

    private void setPoints(int plusGoalsFor, int plusGoalsAgainst) {
        if (plusGoalsFor > plusGoalsAgainst) {
            details.won++;
            points += 3;
        } else if (plusGoalsFor < plusGoalsAgainst) {
            details.lost++;
        } else {
            details.tied++;
            points += 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return teamName.equals(that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }
}
