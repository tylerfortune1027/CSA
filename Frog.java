public class Frog {
	private String name;
	private int xPos;
	private int yPos;
	
	public Frog(String n,int x, int y)		
	{
		name = n;
		xPos=x;
		yPos=y;
		System.out.println(name);
	}
	public void setPos(int x, int y)	
	{
		xPos = x;
		yPos = y;
	}
	public int getXPos()
	{
		return xPos;
	}
	public int getYPos()
	{
		return yPos;
	}
	public void moveDown()		
	{
		xPos = xPos-1;
	}
	public void moveLeft()
	{
		xPos = xPos + 1;
	}
	public void moveUp()
	{
		yPos=yPos+1;
	}
	public void jump(){
		moveUp();
		xPos = xPos-1;
	}
	public void visit(){
		getXPos();
		getyPos();
	}
	public void eatAFly()
	{
		System.out.println("Yum");
	}
	public String toString()
	{
		String s = "Hi I am "+ name +" the frog and I live at "+ xPos + " " + yPos;
		return s; 
	}
	

	public static void main(String[] args) {
		Frog f1 = new Frog("Freddy",3,4);
		f1.eatAFly();						
		f1.moveUp();
		System.out.println(f1);
		Frog f2 = new Frog("Francine", -2,0);
		f2.eatAFly();
		f2.jump(2);
		f1.visit(f2);
		System.out.println(f1);
		System.out.println(f2);
		Frog f3 = new Frog("Frank", -3,-1);
		
		
		
	

	}

}