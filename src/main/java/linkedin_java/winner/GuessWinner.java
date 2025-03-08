package linkedin_java.winner;

import linkedin_java.winner.Team;
import linkedin_java.winner.TeamUtils;

import java.util.List;

public class GuessWinner {
    public static void main(String[] args) {
        Team team1= new Team("Sally","Roger");
        Team team2= new Team("Eric","Rebecca");
        Team team3= new Team("Tonny","Shannon");

        List<Team> teams =List.of(team1,team2,team3);
        int numberOfRounds=4;
        TeamUtils.generateTeamScores(teams,numberOfRounds);
        TeamUtils.revealResults(teams);
    }
}
