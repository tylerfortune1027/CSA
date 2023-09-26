public class MathEx {
    public static void main(String[] Strings){
        System.out.println(swap(125));
         System.out.println(swap(115));
         System.out.println(swap(769));
    timeLeft( 1, 51, 4, 30);
         timeLeft(3, 23, 5, 45);
            timeLeft( 2, 43, 7, 32);
            System.out.println(dayOfWeek(6,11));
             System.out.println(dayOfWeek(5,27));
              System.out.Println(dayOfWeek(2,13));
            
    }

    public static int swap(int initial){
        int ones=initial%10;
        int tens=initial%100/10;
        int hundreds=initial%1000/100;
        int answer= hundreds*100+ones*10+tens*1;
        return answer;
    }
     public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int a = (depHour*60+depMin)- (curHour*60+curMin);
        int b = a/60;
        int c = a%60;
        System.out.println( b+" hours "+ c+ " minutes");

    }
    public static void dayOfWeek(int day, int date){
    int DateTotal= date%7 + (day-1);
    

    }
   
}
