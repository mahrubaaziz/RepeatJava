package repeatJava;
//just a class to get the return type value
public class Polymorp {

	public static void main(String[] args) {
		// has the ability of an object to take many form
		//It actually occur when a parent class refer to a child or sub class
		//child /sub class can define their own unique behavior and share functionalityof the parent class
		//there two type  of polymorphism static and dynamic
		//Inheritance method overriding comes onto polymorphism concept
	

		PolyBank bank_2 = new PolyBank_2();
		PolyBank bank_3 = new PolyBank_3();
		
		System.out.println(bank_2.Interestrate());
		System.out.println(bank_3.Interestrate());
	}

}
