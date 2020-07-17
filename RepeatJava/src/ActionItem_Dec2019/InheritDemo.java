package ActionItem_Dec2019;

public class InheritDemo {

	public static void main(String[] args) {
		
		ProfesorBase p = new ProfesorBase();
		Students s = new Students();
		Students2 s2 = new Students2();
		s.setSTname("John");
		s.setGradyear(2019);
		s2.setSTname("Maria");
		s2.setGradyear(2018);
		
		
		
		
		System.out.println("Student Name is :"+" "+s.getSTname()+" ,"+"Graduation year:"+" "+s.getGradyear());
		System.out.println(s.studentInfo());
		
		System.out.println("Student Name is :"+" "+s2.getSTname()+" ,"+"Graduation year:"+" "+s2.getGradyear());
		System.out.println(s2.studentInfo());
		
	}

}
