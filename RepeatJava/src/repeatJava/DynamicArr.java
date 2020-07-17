package repeatJava;

import java.util.ArrayList;



public class DynamicArr {

	public static void main(String[] args) {
	// Array list is built in Java function
 
		ArrayList myArr = new ArrayList();
	//add object e is a built in method
		
		myArr.add(12);//0th position
		myArr.add("Selenium");//1st position
		myArr.add(true);//2nd position
		myArr.add(12.56);
		
		//System.out.println(myArr);
		
		//System.out.println(myArr.get(1));// to get specific index
		
		myArr.remove(2);//it will remove the specific index from the list i want
		System.out.println(myArr);
		
	}

}
