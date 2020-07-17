package ActionItem_Dec2019;
//8. Create a program using the concept of constructor where you have
//CreditCardName,
//Number,
//EXPDate and
//security code. Print them all.

public class CreditCard {
	//hiding the data
	private String CreditCardName;
	private float CCNum;
	private String ExpDate;
	private int SecCode;
	//creating constructor
	 CreditCard(String Ccardname, float cCardNum, String expdate, int securityCode){
		  Ccardname=CreditCardName;
		  cCardNum = CCNum;
		  expdate = ExpDate;
		  securityCode = SecCode;
	  }
	
//set methods
	public void setCCName(String newvalue){
		CreditCardName = newvalue;
	}
	public void setcreditCardNum(float newvalue){
		CCNum = newvalue;
	}
	public void setexpDate(String newvalue){
		ExpDate = newvalue;
	}
	public void setsecurityCode(int newvalue){
		SecCode = newvalue;
	}
	//get method
	public String getCCName(){
		return CreditCardName;
	}
	public float getcreditCardNum(){
		return CCNum;
	}
	public String getexpDate(){
		return ExpDate;
	}
	public int getsecurityCode(){
		return SecCode;
	}
	
	 

	public static void main(String[] args) {
		CreditCard cc1 = new CreditCard("Mahruba",1234567891231452f,"01/20",326);//Initializing object
		cc1.setCCName("Master Card");//setting new value
		cc1.setcreditCardNum(1234567891231452f);
		cc1.setexpDate("01/20");
		cc1.setsecurityCode(326);
		
		System.out.println("Credit Card Name:"+cc1.getCCName());//getting the values and print them
		System.out.println("Number of Credit Card:"+cc1.getcreditCardNum());
		System.out.println("Date of expiration:"+cc1.getexpDate());
		System.out.println("Security code :"+cc1.getsecurityCode());
		
	}

}
