package ActionItem_Dec2019;
//3. Create a program where it will have fruit name, price, weight, color, taste. Print them one by one.

//Then modify and Print all them in 1 line. 

	
public class Fruit {
	String fname ="fruitName";
	String fcolor = "fruitcolor";
	String weight = "weight";
	String price = "Price";
	String size = "Fsize";
	

	public  void setfruitName(){
		System.out.println("Fruit name is Mango");
	}
	public  void setfruitColor(){
		System.out.println("it's color is yellow");
	}
	public  void setfruitWeight(){
		System.out.println("it weigh 5 lbs");
	}
	public  void setfruitPrice(){
		System.out.println(" price is $6 per lb");
	}
	public  void setfruitSize(){
		System.out.println("and size is big");
	}
	public void fruitInfo(){
		System.out.println();
	}
	

	public static void main(String[] args) {
		Fruit ft = new Fruit();
		ft.setfruitName();
		ft.setfruitColor();
		ft.setfruitWeight();
		ft.setfruitPrice();
		ft.setfruitSize();
		
		
		
		
		
	}
}
