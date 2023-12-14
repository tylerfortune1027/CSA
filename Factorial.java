public class Factorial {
    
    public static long calcFactorial( int n){
        long x = 1;
        
        for (int i = 1; i <= n ; i++ ){
           x *= i;
        }
        return x;
    }

    public static double calcE(){
        double E = 1;
        double oldE = 0;
        int i = 1;

        while(E - oldE > .001){
            oldE = E;
            E += (1.0 / calcFactorial(i));
            i++;
        }
        return E;
    }

    public static double calcEX(int n){
        double E = 1; 
        double oldE = 0;

        for(int i = 1; E - oldE > .001; i++){ 
            oldE = E; 
            E += (Math.pow(n, i) / calcFactorial(i)); 
        }

        return E;

    }
    public static void main(String[] args) {
        System.out.println("Q1: \n");
         for(int i = 1; i<= 20; i++)
        System.out.println(calcFactorial(i));
         System.out.println("\n");

        System.out.println("Q2: \n");
        System.out.println(calcE());
        System.out.println("\n");


        System.out.println("Question 3: \n");
        for(int i = 1; i<= 5; i++)
        System.out.printf("e is %2.3f \n", calcEX(i));
        System.out.println("\n");
    }

}
  