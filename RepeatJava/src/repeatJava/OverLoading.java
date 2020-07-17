package repeatJava;

public class OverLoading {

	public static void main(String[] args) {
		
		System.out.println(Add(1,50));
		System.out.println(Add(5.354,40.25));
		System.out.println(Add("Java","Selenium"));
		
	}
		//it's a  process of specify multiple methods under a class.
		//Allows different methods to have a same name but different signature
		//Ex:number of parameter type of parameters,method name,order of parameters
		//Parameter:is an argument value that passed into a function
	
		public static int Add(int a, int b){
			return (a+b);
			
		}
		public static double Add(double a,double b){
			return(a+b);
		}
		
	  public static String Add(String a, String b){
		  return(a+b);
	}
	
}



