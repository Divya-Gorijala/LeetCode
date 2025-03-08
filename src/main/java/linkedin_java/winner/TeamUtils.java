package linkedin_java.winner;

import linkedin_java.winner.Team;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class TeamUtils {
    public static void generateTeamScores(List<Team> teams, int numberOfRounds){
        for(Team team: teams){
            for(int i=0;i<numberOfRounds;i++){
                int score= (int)(Math.random()*100) + 1;
                team.addScore(score);
            }
        }
    }

    public static void revealResults(List<Team> teams) {
        List<Team> modifiableTeams = new ArrayList<>(teams);
        Comparator<Team> scoreComparator = (t1, t2) -> Integer.compare(t2.sumTotalScore(), t1.sumTotalScore());
        modifiableTeams.sort(scoreComparator);
        for(Team t :modifiableTeams){
            System.out.println(t.sumTotalScore()+" "+t.getName());
        }
    }
}
