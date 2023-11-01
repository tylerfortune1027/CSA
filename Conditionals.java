public class Conditionals {


    public boolean chimpTrouble (boolean aSmile, boolean bSmile){
        if (aSmile == bSmile)
            return true;
        else 
            return false;

    }
    public boolean negPos(int a ,int b ,boolean negative){
        if ((a<0 && b>0)|| a>0 && b<0)
            return true;
                {
                    if ((negative == true)&& (a<0 && b<0))
                    return true;
                else  
                    return false;
                }
            
    }

    public static void main (String [] args){
        Conditionals ab = new Conditionals();
        System.out.println(ab.chimpTrouble(true, true)); 
        System.out.println(ab. chimpTrouble (false, false));
        System.out.println(ab.chimpTrouble (true, false)); 
        System.out.println(ab.chimpTrouble (false, true));
        System.out.println();
        
        System.out.println(ab.negPos(1, -1, false));
        System.out.println(ab.negPos (-1, 1, false));
        System.out.println(ab.negPos(1, 1, false)); 
        System.out.println(ab.negPos (-1, -1, false)); 
        System.out.println(ab.negPos (-4, -5, true));
        System.out.println(ab.negPos (-4, 5, true));
        System.out.println(ab.negPos (4, 5, true)); 
        System.out.println(ab.negPos (4, -5, true)); 
    


}
}
