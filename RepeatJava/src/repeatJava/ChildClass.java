package repeatJava;

public class ChildClass extends BaseClass {

	public static void main(String[] args) {
		ChildClass obj1 = new ChildClass();
		BaseClass obj2 = new BaseClass();
		obj2.calculateHOA();
		obj1.calcarEMI();
		obj1.calculateHOA();
		obj1.calHomeEMI();
		obj1.offerService();
	}
	
	public void calHomeEMI()
	{
		System.out.println("Your EMI is 50K");
	}
	
	public void calcarEMI()
	{
		System.out.println("Your EMI is 25K");
	}

}
