package linkedin_java.winner;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String player1;
    private String player2;
    private final List<Integer> scores;

    public Team(String player1,String player2){
        this.player1=player1;
        this.player2=player2;
        scores=new ArrayList<>();
    }

    public void addScore(int score){
        scores.add(score);
    }
    
    

    public int sumTotalScore(){
        int total =0;
        for(int score: scores){
            total=total+score;
        }
        return total;
    }

    public int getScore() {
        return sumTotalScore();
    }
    public String getName(){
        return player1+" "+player2;
    }
}
