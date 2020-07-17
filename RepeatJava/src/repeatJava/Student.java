package repeatJava;

public class Student {

	public static void main(String[] args) {
		
		Student b = new Student();
		System.out.println("Entry Point");
		b.driving();
		b.sleeping();
		b.walking();
		System.out.println("Exit Point");
		
	}	
	
		public void driving()
		{
			
			System.out.println("I am Driving");
		}
		
		public void sleeping()
		{
			System.out.println("I am Sleeping");
		}
		
		public void walking()
		{
			System.out.println("I am Walking");
			
		}
	

}
