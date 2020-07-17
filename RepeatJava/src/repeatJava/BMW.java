package repeatJava;
//derived class from the cars class
public class BMW extends Cars {
	//BMW is a subclass
	public int seatNum;
	//BMW sub class has constructor
	public BMW(int geer, int speed, int startspeed)
	{   //invoking base-class(Cars) constructor
		super(geer, speed);
	seatNum = startspeed;
	}
	//Encapsulation getter and setter
	public void seatNum(int newvalue)
	{
		seatNum = newvalue;
	}
	

	public String toString()
	{
		return (super.toString()+
				"\nNumber of Seat is"+" "+seatNum);
	}
	public static void main(String[] args) {
		
	}

}
