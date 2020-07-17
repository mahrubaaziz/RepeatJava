package repeatJava;

public class ArraySession {

	public static void main(String[] args) {
		//Array:store multiple values in single variable
		//container that contain data/value in single variable
		//Limitation :sizing and type of data issue NOTE: if you use
		//dynamic array this limitation can be overcome 
		
		//1.Declare the array (int[] array)
		//2.Initialize the size and set it's size(array = new array)
		
		int [] names = new int[4];
				
				names[0]=123;
				names[1]=57825;
				names[2]=46545;
				names[3]=8987;
				
		/*String [] names = new String[4];	
				names[0]="Selenum";
				names[1]="Java";
				names[2]=true;
				names[3]=12.56;
				*/
				
				//this is  another type of loop
				for(int str:names)//str is a variable name here, it could be anything
				{
					System.out.println(str);
				}
				
				
				//System.out.println(names[0]);
				//System.out.println(names[2]);
				
				//int totalsize=names.length;  we can write  this way too
				
				/*for(int i=0; i<names.length ;i++)// this .length will allow us to make the changes in the length
				{
					System.out.println(names[i]);
				}*/
	}

}
