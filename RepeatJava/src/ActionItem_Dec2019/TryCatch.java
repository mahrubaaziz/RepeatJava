package ActionItem_Dec2019;
//1. Do the following: This will require some online research
//Create an Error.
//Handle the error.
//Create a custom exception which will provide a friendly message.
//Handle both errors using only one try-catch block.


public class TryCatch {

	public static void main(String[] args) {
		
		try{
		int [] a = {3 ,4 ,9}; //create an array with size 2
		System.out.println(a[3]); //Trying to get the element in 3rd index
		}catch (Exception e){ //catch the exception
			System.out.println("An exception is handled"); //This massage will print instead of big exception notification
		}
	}

}
