public class Box {
    private double length;
    private double width;
    private double height;
    private String color;
    private boolean hasALid;

    // constructor - a method that creates/ initializes an instance//
    // of a class
    public Box(double l, double w, double h, String c, boolean lid){
        length = l;
        width = w;
        height = h;
        color = c;
        hasALid = lid;
    }
    //overload the constructor
    public Box(double l, double w, double h){
        length = l;
        width = w;
        height = h;
        color = "purple";
        hasALid = true;
    }
    // default contructor
    public Box(){
        length = 1.0;
        width = 1.0;
        height = 1.0;
        color = "white";
        hasALid = false;

    }
    public static void main (String[] args){
        // create and instance
        Box b1 = new Box(6.5, 8.3, 9.4,"brown", false);
        Box b2 = new Box(3.6,2.8,7.4);
        Box b3 = new Box();


    }
}
