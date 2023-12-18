public class ForLoops {
    public static int addEvens(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
    public static void printSquaresBack(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }
    public static void sillyNumbers(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(j);
                } 
            }
                 System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Q1: \n");
        System.out.println(addEvens(10));
        System.out.println(addEvens(100));
        System.out.println(addEvens(1000));
        System.out.println("\n");
        System.out.println("Q2: \n");
        printSquaresBack(10);
        printSquaresBack(20);
        printSquaresBack(30);
        System.out.println("\n");
        // Question 3:
        System.out.println("Q3: \n");
        sillyNumbers();
        System.out.println("\n");
        // Question 4:
        System.out.println("Q4: \n");
        sillyNumbers2();
        System.out.println("\n");
    }

}

}



