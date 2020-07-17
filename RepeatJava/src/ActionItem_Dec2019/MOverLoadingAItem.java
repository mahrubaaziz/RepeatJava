package ActionItem_Dec2019;

//5. Create a program using method overloading concept where you have 
//3 int which will multiply, 5 String, 2 decimal values you will subtract? 
//OR Create a program which will contain 5 different actions. 
//The method name should be same for all the actions. Use as many different data type as possible.
//Example: int, double, String, etc?

public class MOverLoadingAItem {
	
	//declaring a return type methods with parameter
	public static int overLoad(int a, int b, int c){
		return (a*b*c);
	}

	public static String overLoad(String a, String b, String c, String d, String e ){
		return  (a+ b + c + d + e);
	}
	
	public static double overLoad(double a, double b){
		return (a-b);
	}

	public static void main(String[] args) {
		
		System.out.println(overLoad(3,5,2));
		System.out.println(overLoad("This ", "season ", "is ", "very ", "magical"));
		System.out.println(overLoad(8.90,3.52));
	}
	
	
}
