package repeatJava;

public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status;
		status = true;// only takes two type of data true or false
		
		System.out.println(status);// calling the variable
		
		
		byte b = 100; //any value after 12 it wont accept it , java treat short and long as integer
		System.out.println(b);

		short a = 30000;
		System.out.println(a);
		
		long z = 1234567893232l;//but need to write 'l' after the value for long 
		System.out.println(z);
		
		float s = 12.35f;// need to put 'f' after the value
		System.out.println(s);
		
		double f =59.00;
		System.out.println(s+" "+f);
	}

}
