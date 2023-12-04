public class WhileLoops {
    
    public int addOdds(int n){
        int sum = 0;
        n = 3;

        while (n % 2 == 1){
        sum = n + 2;
        }
        return sum;
    }
    public static void main(String[] args) {
        WhileLoops ab = new WhileLoops();
        System.out.println(ab.addOdds(3));
    }
}

