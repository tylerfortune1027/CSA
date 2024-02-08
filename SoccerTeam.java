public class SoccerTeam {
    private int numWins;
    private int numLosses;
    private int ties;

    public SoccerTeam (int score){
        numWins = 0;
        numLosses = 0;
        ties = 0;
    }

    public void played (SoccerTeam other, int myScore, int otherScore){
        if (myScore > otherScore){
            numWins++;
            other.numLosses++;
        }
        if (otherScore > myScore){
            numLosses++;
            other.numWins++;
        }
        else {
            ties++;
            other.ties++;
            }
    }
    public static int reset (){
        
    }

      
    public static void main(String[] args) {
            
        }
}

