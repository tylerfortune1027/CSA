public class SoccerTeam {
    private int numWins;
    private int numLosses;
    private int ties;

    private static int gamesPlayed = 0;
    private static int goalsScored= 0;

    public SoccerTeam (){
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
    public int points(){
        return (numWins * 3) + (ties * 1);
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
    SoccerTeam.gamesPlayed = 0;
    SoccerTeam.goalsScored = 0;

}

      
    public static void main(String[] args) {
            
            System.out.println("Tournament 1: \n");
            SoccerTeam team1 = new SoccerTeam();
            SoccerTeam team2 = new SoccerTeam();
            team1.played(team2, 3, 2);
            System.out.println("Team 1 points: " + team1.points());
            System.out.println("Team 2 points: " + team2.points());
            System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
            System.out.println("Goals scored: " + SoccerTeam.getGoalsScored());
            System.out.println("\n");
           
            System.out.println("Tournament 2: \n");
            team1.reset();
            team2.reset();
            team1.played(team2, 1, 1);
            System.out.println("Team 1 points: " + team1.points());
            System.out.println("Team 2 points: " + team2.points());
            System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
            System.out.println("Goals scored: " + SoccerTeam.getGoalsScored());
            System.out.println("\n");
            
            System.out.println("Tournament 3: \n");
            team1.reset();
            team2.reset();
            team1.played(team2, 0, 2);
            System.out.println("Team 1 points: " + team1.points());
            System.out.println("Team 2 points: " + team2.points());
            System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
            System.out.println("Goals scored: " + SoccerTeam.getGoalsScored());
            System.out.println("\n");

            System.out.println("Tournament 4: \n");
            team1.reset();
            team2.reset();
            team1.played(team2, 2, 2);
            System.out.println("Team 1 points: " + team1.points());
            System.out.println("Team 2 points: " + team2.points());
            System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
            System.out.println("Goals scored: " + SoccerTeam.getGoalsScored());
            System.out.println("\n");
        }    
    }
    

        }
}

