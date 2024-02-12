public class SoccerTeam {
    private int numWins;
    private int numLosses;
    private int ties;

    private static int gamesPlayed = 0;
    private static int goalsScored= 0;

    public SoccerTeam (int score){
        this.numWins = 0;
        this.numLosses = 0;
        this.ties = 0;
    }

    public void played (SoccerTeam other, int myScore, int otherScore){
        if (myScore > otherScore){
            this.numWins++;
            other.numLosses++;
        }
        else if (otherScore > myScore){
            this.numLosses++;
            other.numWins++;
        }
        else {
            this.ties++;
            other.ties++;
            }
        }
    public int getPoints(){
        return 3 * this.numWins + this.ties;
    }
    
    public void reset(){
        this.numWins= 0;
        this.numLosses= 0;
        this.ties= 0;
    }
public int getGamesPlayed(){
    return gamesPlayed;
}
public int getGoalsScored(){
    return goalsScored;

}
public void startTournament(){
    
}

      
    public static void main(String[] args) {
            

        }
}

