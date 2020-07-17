package ActionItem_Dec2019;
//4. Using the concept of Inheritance, Polymorphism, and Method Overriding 
//to create a program where you have a professor, student name, the year of 
//his/her graduation year and gpa. Print them all.
//Extra Credit: Add 2-3 more students' student names, the year of his/her graduation and gpa into the code. Now print them all.

public class ProfesorBase {
	private String STname;
	private int Gradyear;
	
	

	public ProfesorBase(String sTname, int gradyear) {
		super();
		STname = sTname;
		Gradyear = gradyear;
	}
	//default constructor
	public ProfesorBase(){
		
	}

	public String getSTname() {
		return STname;
	}

	public void setSTname(String sTname) {
		STname = sTname;
	}



	public int getGradyear() {
		return Gradyear;
	}



	public void setGradyear(int gradyear) {
		Gradyear = gradyear;
	}
	
	String GPA;
	public String studentInfo(){
		return GPA;
	}



	public static void main(String[] args) {
		
	}

}
