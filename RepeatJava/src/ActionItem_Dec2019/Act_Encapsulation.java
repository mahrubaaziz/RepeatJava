package ActionItem_Dec2019;
//1. Create a program using Encapsulation where you have firstName, LastName,
//collegeName, studentID, zipcode. Print them all.
//Print the data at once in a sentence?

class Student{
	
	private String firstName;
	private String lastName;
	private String collegeName;
	private int studentId;
	private int zipcode;
	
	//get method
	public String getFName(){
		return firstName;
	}
	public String getLName(){
		return lastName;
	}
	public String getCollege(){
		return collegeName;
	}
	public int getID(){
		return studentId;
	}
	public int getZipCode(){
		return zipcode;
	}
	
	//set method
	public void setFName(String newvalue){
		firstName = newvalue;
		}
	public void setLName(String newvalue){
		lastName = newvalue;
	}
	public void setCollege(String newvalue){
		collegeName = newvalue;
	}
	public void setID(int newvalue){
		studentId = newvalue;
	}
	public void setZipCode(int newvalue){
		zipcode = newvalue;
	}
}

public class Act_Encapsulation {

	public static void main(String[] args) {
		Student s = new Student();
		s.setFName("Taylor");
		s.setLName("John");
		s.setCollege("City College");
		s.setID(29363201);
		s.setZipCode(11218);
		
		System.out.println("Student Firstname:"+" "+ s.getFName());
		System.out.println("Stujdent Lastname:"+" "+ s.getLName());
		System.out.println("Stujdent College:"+" "+ s.getCollege());
		System.out.println("Stujdent ID:"+" "+ s.getID());
		System.out.println("Stujdent zipcode:"+" "+ s.getZipCode());
		
		System.out.println("Student Info:" + " "+ s.getFName()+" "+s.getLName()+" "+s.getCollege()+" "+s.getID()+" "+s.getZipCode());
		
		
		
	}

}

