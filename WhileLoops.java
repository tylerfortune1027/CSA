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
    public static int sumDigits(int n){
    int sum = 0;
    while (n>0){
        sum += n % 10;
        n /=10;
    }
    return sum;
    }

public static int howManyYears(double startpop, double endpop){
        int years = 0;
        while (startpop < endpop) { 
            startpop *= 1.0113; 
            years++; 
        }
        return years;
    }

public static void main(String[] args) {
    
    System.out.println("Q1: \n");
    System.out.println(addOdds(3));
    System.out.println(addOdds(6));
    System.out.println(addOdds(9));
    System.out.println("\n");
    
    System.out.println("Q2: \n");
    System.out.println(sumDigits(543));
    System.out.println(sumDigits(6543));
    System.out.println(sumDigits(76543));
    System.out.println("\n");
   
     System.out.println("Q3: \n");
    System.out.println(howManyYears());
    System.out.println(howManyYears());
    System.out.println(howManyYears());
    System.out.println("\n");
}

}



