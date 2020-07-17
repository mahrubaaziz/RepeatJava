package repeatJava;

//parent class (super class)

public class Encacpsulation {

	public static void main(String[] args) {
		
		Encap obj = new Encap();
		obj.setEmpName("Mahruba");
		obj.setEmpAge(45);
		obj.setSSN(123456789);
		
		System.out.println("Employee Name:"+obj.getEmpName());
		System.out.println("Employee Age:"+obj.getEmpAge());
		System.out.println("Employee SSN:"+obj.getSSN());
	}
	
}
//Child class/ sub class (constructor)
	class Encap{
		// it  is process of combining data and function into
		//a single unit class. The data is  not accessed
		//directly. It'a accessed through the function 
		//present inside the class
		
		private int ssn;
		private String empName;
		private int empAge;
		
	//get method
	
		public int getSSN(){
			return ssn;
		}
		
		public String getEmpName(){
			return empName;
		}
		
		public int getEmpAge(){
			return empAge;
		}
		
	//set method
		public void setEmpName(String newvalue){
			empName = newvalue;
		}
		
		public void setEmpAge(int newvalue){
			empAge = newvalue;
		}
		
		public void setSSN(int newvalue){
			ssn = newvalue;
		}
		

	}


