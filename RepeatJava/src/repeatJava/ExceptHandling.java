package repeatJava;

public class ExceptHandling {

	public static void main(String[] args) {
/*try	{ //try catch block  allows us to capture the error 
	//that is happening within a method so that we can debug it
		int a=5, b=0, c;
		c=a/b;
		System.out.println(c);
	}
	catch(Exception x){
		System.out.println("Divide by zero output is"+x);
	}

}*/
	try{
		int a[] = new int[5];
		a[1]=20;
		a[4]=30;
		a[10]=25;//error coz array is 5
}catch(Exception y){
	System.out.println(y);}
}
	
}