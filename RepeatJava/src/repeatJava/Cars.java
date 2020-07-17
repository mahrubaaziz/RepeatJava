package repeatJava;
//base class=parent class= super class
//child class= sub class
 class Cars {
	//Cars class has 2 fields(Attribute)
	public int geer;
	public int speed;
	//Constructor
	public Cars(int geer, int speed)
	{
		this.geer = geer;
		this.speed = speed;
	}
	//3 methods we dont use it yet but if we want to we can
	public void pushBreak(int decrement)
	{
		speed -=decrement;
	}
	
	public void increaseSpeed(int increment)
	{
		speed +=increment;
	}
	
	public String toString ()//toString is a function method here
	{
		return("Number of geers are"+" "+geer
				+"\n"//its a line break "\n"
				+"Speed of the Car is"+" "+speed);
	}
	
	

	public static void main(String[] args) {
		
	}

}
