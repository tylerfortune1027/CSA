public class Yummy {
    public static void main (String [] args){
        System.out.println("yummy");
        chocolate();
        icecream();
    }
     public static void chocolate(){
        System.out.print("Chocolate");
        System.out.println("cake");
     }
public static void frenchfries(){
    System.out.println("French Fries with ketchup.");
    chocolate();
    System.out.println(" That was yummy."); 
}
public static void icecream(){
    System.out.println("Ice");
    frenchfries();
    System.out.println("Cream");

}
}