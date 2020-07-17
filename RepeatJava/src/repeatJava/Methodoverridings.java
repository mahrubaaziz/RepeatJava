package repeatJava;
//parent class and obj1 method
 class Methodoverridings {
	//it is a feature that allows a subclass or child class
			//to provide a specific implementation of a method
			//thats is already used in super /parent class
	
	void show ()
	{
		System.out.println("Animal show");
	}
}
//inherited child  class and obj2 method
class Child extends Methodoverridings{
	@Override 
	void show()
	{
		System.out.println("Animal Child show");
	}
}
//Driver class
class MainC{

	public static void main(String[] args) {
	//Methodoverriding is referencing to parent object, then parent show(0 method is called
		Methodoverridings obj1 = new Methodoverridings();// parent class
		Child obj2 = new Child();//child class
		obj1.show();
		//if the Methodoverridings referencing to child object show() is called 
		// this is during run time of polymorphism
		obj2.show();
	}

}
