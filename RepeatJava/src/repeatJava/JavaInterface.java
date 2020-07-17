package repeatJava;

interface Persons{
	public void subject();// always we have to declare the data type initially
	void studentName();// whenever we declare the first  one as public 2nd one immediately know it's public
	
}
	public  class JavaInterface implements Persons
	// reference type in java which is similar to class
				//it will contain abstract method.
				//A class will be implemented an interface.
			//skeletal:	
				//intereface person
				//public void Subject();
				//public void studentName();

	{
		public void subject(){
			System.out.println("This is mth student");
		}
		
			public void studentName(){
				System.out.println("JOHN");
			}
			
public static void main(String[] args) {
	JavaInterface e = new JavaInterface();
	e.studentName();
	e.subject();
		
	}

}
