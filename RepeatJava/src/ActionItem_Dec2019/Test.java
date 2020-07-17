package ActionItem_Dec2019;

public class Test {

	public static void main(String[] args) {
		//creating an obj with ref. variable
		Car c = new SportsCar();
		
		System.out.println(c.Brand);//calling with ref variable
		System.out.println(c.Speed());
	}

}
