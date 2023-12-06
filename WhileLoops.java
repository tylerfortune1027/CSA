public class WhileLoops {
    
    public static int addOdds(int n) {
    int sum = 0; 
    int i = 1; 

    while (i <= n) { 
        sum += i; 
        i += 2;
    }

    return sum;  
    }
}

