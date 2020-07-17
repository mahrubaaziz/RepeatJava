package repeatJava;

public class Name {
	String  strFirstName ;
	String strLastName;
	String strMiddleName ;
	String strActFullName ;
	
	public void setName(String First, String Mid, String Last){
		
		strFirstName= First;
		strLastName = Last;
		strMiddleName = Mid;
		strActFullName = Last+","+First+" "+Mid;
		
	}
public void validateName(){
	if (strActFullName.equalsIgnoreCase(strLastName+","+strFirstName+" "+strMiddleName))
	{
	System.out.println("The name format is passed");
    }
	else
    {
	System.out.println("The format is failed");
    }
}

	public static void main(String[] args) {
		
		Name n = new Name();
		n.setName("John", "N", "Doe");
		n.validateName();
		n.setName("Rabi","N",  "Majumder");
		n.validateName();
		
	}

}
