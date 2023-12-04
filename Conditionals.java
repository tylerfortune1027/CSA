public class Conditionals {

    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }

    public boolean negPos(int a, int b, boolean negative){
        if(negative && a * b > 0){
            return a < 0 && b < 0;
        }
        return (!negative && a < 0 ^ b < 0);
    }

    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if(isMorning && isMom && !isAsleep){
            return true;
        }
        return !(isMorning || isAsleep);
    }
    public String setAlarm(int day, boolean onVacation){
        if(onVacation && (day == 0 || day == 6)){
            return "off";
        } else if(day == 0 || day == 6 || onVacation) {
            return "10:00";
        }
        return "7:00";
    }
    public boolean onesDigitSame(int a, int b, int c){
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }
    public int blackjack(int a, int b){
        if(a <= 21 && b <= 21){
            if (a < b){
                return b;
            }
            return a;
        } else if(a > 21 && b > 21){
            return 0;
        }
        else if(a - b > 0){
            return b;
        } 
        else if(b - a > 0){
            return a;
        }

        return 0;
    }


    public static void main (String [] args){
        Conditionals ab = new Conditionals();
        System.out.println("chimpTrouble: ");
        System.out.println(ab.chimpTrouble(true, true));
        System.out.println(ab.chimpTrouble(false, false));
        System.out.println(ab.chimpTrouble(true, false));
        System.out.println(ab.chimpTrouble(false, true));
        System.out.println();

        System.out.println("negPos: ");
        System.out.println(ab.negPos(1, -1, false));
        System.out.println(ab.negPos(-1, 1, false));
        System.out.println(ab.negPos(1, 1, false));
        System.out.println(ab.negPos(-1, -1, false));
        System.out.println(ab.negPos(-4, -5, true));
        System.out.println(ab.negPos(-4, 5, true));
        System.out.println(ab.negPos(4, 5, true));
        System.out.println(ab.negPos(4, -5, true));
        System.out.println();

        System.out.println("pickUp: ");
        System.out.println(ab.pickUpPhone(false, false, true));
        System.out.println(ab.pickUpPhone(true, true, true));
        System.out.println(ab.pickUpPhone(true, true, false));
        System.out.println(ab.pickUpPhone(false, true, false));
        System.out.println(ab.pickUpPhone(true, false, false));
        System.out.println(ab.pickUpPhone(false, false, false));
        System.out.println("\n");

        System.out.println("setAlarm: ");
        System.out.println(ab.setAlarm(1, false));
        System.out.println(ab.setAlarm(5, false));
        System.out.println(ab.setAlarm(0, false));
        System.out.println(ab.setAlarm(2, true));
        System.out.println(ab.setAlarm(4, true));
        System.out.println(ab.setAlarm(6, true));
        System.out.println();

        // Question 5
        System.out.println("onesDigs: ");
        System.out.println(ab.onesDigitSame(23, 19, 13));
        System.out.println(ab.onesDigitSame(23, 19, 12));
        System.out.println(ab.onesDigitSame(23, 19, 3));
        System.out.println(ab.onesDigitSame(423, 13, 3));
        System.out.println(ab.onesDigitSame(23, 29, 25));
        System.out.println("\n");

        System.out.println("BlackJack: ");
        System.out.println(ab.blackjack(19, 21));
        System.out.println(ab.blackjack(21, 19));
        System.out.println(ab.blackjack(19, 22));
        System.out.println(ab.blackjack(8, 8));
        System.out.println(ab.blackjack(25, 24));
        System.out.println(ab.blackjack(17, 9));
        System.out.println(ab.blackjack(12, 18));
        System.out.println();
    }
}

